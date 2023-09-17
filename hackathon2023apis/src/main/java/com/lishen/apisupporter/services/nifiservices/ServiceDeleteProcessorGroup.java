package com.lishen.apisupporter.services.nifiservices;

import com.alibaba.fastjson2.JSONObject;
import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.common.nifiapi.ProgressRequestBody;
import com.lishen.apisupporter.common.nifiapi.ProgressResponseBody;
import com.lishen.apisupporter.common.nifiapi.api.ProcessGroupsApi;
import com.lishen.apisupporter.common.nifiapi.model.ProcessGroupDTO;
import com.lishen.apisupporter.common.nifiapi.model.ProcessGroupEntity;
import com.lishen.apisupporter.common.nifiapi.model.ProcessGroupsEntity;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Locale;

@Slf4j
public class ServiceDeleteProcessorGroup implements NifiService {

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
            this.groupName = parameterList.get(0);
        }
    }

    @Override
    public void setParameters(JSONObject parameterJson) {

    }

    @Override
    public NifiResponse commit() throws ApiException {
        log.debug("ServiceDeleteProcessorGroup is executed!");

        // Get all processor group.
        ProcessGroupsApi processGroupsApi = new ProcessGroupsApi();
        processGroupsApi.setApiClient(NifiClient.getClient());
        String targetId = null;
        Long version = 1L;
        ProcessGroupsEntity allGroups = processGroupsApi.getProcessGroups(this.parentGroupId);
        for (ProcessGroupEntity eachGroup : allGroups.getProcessGroups()) {
            if (eachGroup.getComponent().getName().equalsIgnoreCase(this.groupName)) {
                targetId = eachGroup.getComponent().getId();
                version = eachGroup.getRevision().getVersion();
                break;
            }
        }
        String reply="";
        ProcessGroupEntity newEntity=null;
        if (targetId == null) {
            // Can't find.
            reply = String.format("Sorry. Can't find a processor group called '%s'", this.groupName);
        } else {
            newEntity = processGroupsApi.removeProcessGroup(targetId, String.valueOf(version), null, false);
            reply = String.format("Processor group '%s' (ID '%s') has been removed.", this.groupName, targetId);
        }

        return new NifiResponse(reply, newEntity);
    }

}