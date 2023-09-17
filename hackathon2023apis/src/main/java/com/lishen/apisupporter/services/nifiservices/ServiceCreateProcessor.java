package com.lishen.apisupporter.services.nifiservices;

import com.alibaba.fastjson2.JSONObject;
import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.common.nifiapi.api.ProcessGroupsApi;
import com.lishen.apisupporter.common.nifiapi.model.PositionDTO;
import com.lishen.apisupporter.common.nifiapi.model.ProcessorDTO;
import com.lishen.apisupporter.common.nifiapi.model.ProcessorEntity;
import com.lishen.apisupporter.common.nifiapi.model.RevisionDTO;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ServiceCreateProcessor implements NifiService{
    private String parentGroupId;
    private String processorType;

    private ProcessorEntity processorEntity;

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    @Override
    public void setParameters(List<String> parameterList) {

    }

    @Override
    public void setParameters(JSONObject parameterJson) {
        /**
         * Prepare all the setups.
         */
        this.processorEntity = new ProcessorEntity();
        RevisionDTO revision = new RevisionDTO();
        revision.setVersion(0L);
        this.processorEntity.setRevision(revision);

        // Position
        ServicesGeneral serviceGeneral = new ServicesGeneral(this.parentGroupId);
        PositionDTO maxPosition = serviceGeneral.getMaxXY();

        Double positionStep = parameterJson.getDouble("positionStep");
        maxPosition.setX(maxPosition.getX() + positionStep);

        ProcessorDTO component = new ProcessorDTO();
        component.setPosition(maxPosition);

        // type
        String type = parameterJson.getString("classfile");
        component.setType(type);

        // name
        String name = parameterJson.getString("name");
        component.setName(name);

        this.processorEntity.setComponent(component);


    }

    @Override
    public NifiResponse commit() throws ApiException {
        log.debug("ServiceCreateProcessor is executed!");
        ProcessGroupsApi processGroupsApi = new ProcessGroupsApi();
        processGroupsApi.setApiClient(NifiClient.getClient());

        ProcessorEntity resultEntity = processGroupsApi.createProcessor(this.parentGroupId, this.processorEntity);
        NifiResponse response = new NifiResponse();
        response.setReplyMessage("Processor created!");
        response.setReturnObject(resultEntity);
        return response;
    }



}
