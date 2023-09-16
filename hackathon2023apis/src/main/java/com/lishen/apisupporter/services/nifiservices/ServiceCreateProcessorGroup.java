package com.lishen.apisupporter.services.nifiservices;

import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.common.nifiapi.api.ProcessGroupsApi;
import com.lishen.apisupporter.common.nifiapi.model.ProcessGroupDTO;
import com.lishen.apisupporter.common.nifiapi.model.ProcessGroupEntity;
import com.lishen.apisupporter.common.nifiapi.model.RevisionDTO;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ServiceCreateProcessorGroup implements NifiService {

    private String groupName;

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    private String parentGroupId;

    @Override
    public void setParameters(List<String> parameterList) {
        if (parameterList != null && parameterList.size() == 1) {
            groupName = parameterList.get(0);
        }
    }

    @Override
    public NifiResponse commit() throws ApiException {
        log.debug("ServiceCreateProcessorGroup is executed!");
        ProcessGroupsApi processGroupsApi = new ProcessGroupsApi();
        processGroupsApi.setApiClient(NifiClient.getClient());

        ProcessGroupEntity body = new ProcessGroupEntity();

        RevisionDTO revision = new RevisionDTO();
        // revision.setClientId(parentGroupId);
        revision.setVersion(0L);

        ProcessGroupDTO component = new ProcessGroupDTO();
        component.setName(groupName);

        body.setRevision(revision);
        body.setComponent(component);

        ProcessGroupEntity newEntity = processGroupsApi.createProcessGroup(this.parentGroupId, body, "KEEP_EXISTING");
        String reply = "Opss! Can't do that.";
        if (newEntity.getComponent().getId() != null && !newEntity.getComponent().getId().isEmpty()) {
            String processorGroupId = newEntity.getComponent().getId();
            reply = String.format("Here you are. Component ID: %s", processorGroupId);
        }

        return new NifiResponse(reply, newEntity);
    }
}
