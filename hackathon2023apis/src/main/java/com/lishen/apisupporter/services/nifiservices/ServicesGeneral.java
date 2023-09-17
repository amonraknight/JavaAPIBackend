package com.lishen.apisupporter.services.nifiservices;


import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.common.nifiapi.api.ProcessGroupsApi;
import com.lishen.apisupporter.common.nifiapi.model.PositionDTO;
import com.lishen.apisupporter.common.nifiapi.model.ProcessorEntity;
import com.lishen.apisupporter.common.nifiapi.model.ProcessorsEntity;

import java.util.List;

public class ServicesGeneral {

    public ServicesGeneral() {

    }
    public ServicesGeneral(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }
    private String parentGroupId;




    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    /*
     * Get the position o
     * */
    public PositionDTO getMaxXY()  {
        PositionDTO positions = new PositionDTO();
        positions.setX(0d);
        positions.setY(0d);

        ProcessorsEntity processorsEntity = null;
        try {
            processorsEntity = getAllProcessors();
            List<ProcessorEntity> processorsList = processorsEntity.getProcessors();
            if (processorsList != null && processorsList.size() > 0) {
                for (ProcessorEntity eachProcessor : processorsList) {
                    Double eachX = eachProcessor.getComponent().getPosition().getX();
                    Double eachY = eachProcessor.getComponent().getPosition().getY();
                    positions.setX(Math.max(eachX, positions.getX()));
                    positions.setY(Math.max(eachY, positions.getY()));
                }
            }
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

        return positions;
    }

    /**
     * @return ProcessorsEntity
     * @throws ApiException
     */
    public ProcessorsEntity getAllProcessors() throws ApiException {
        ProcessGroupsApi processGroupsApi = new ProcessGroupsApi();
        processGroupsApi.setApiClient(NifiClient.getClient());

        ProcessorsEntity processorsEntity = processGroupsApi.getProcessors(this.parentGroupId, false);
        return processorsEntity;
    }
}
