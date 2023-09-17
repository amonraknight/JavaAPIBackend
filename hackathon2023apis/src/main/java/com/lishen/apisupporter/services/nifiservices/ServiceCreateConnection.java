package com.lishen.apisupporter.services.nifiservices;

import com.alibaba.fastjson2.JSONObject;
import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.common.nifiapi.api.ProcessGroupsApi;
import com.lishen.apisupporter.common.nifiapi.model.ConnectableDTO;
import com.lishen.apisupporter.common.nifiapi.model.ConnectionDTO;
import com.lishen.apisupporter.common.nifiapi.model.ConnectionEntity;
import com.lishen.apisupporter.common.nifiapi.model.RevisionDTO;

import java.util.ArrayList;
import java.util.List;

public class ServiceCreateConnection implements NifiService{
    private String parentGroupId;

    private ConnectionEntity connectionEntity;


    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }


    @Override
    public void setParameters(List<String> parameterList) {

        this.connectionEntity = new ConnectionEntity();

        RevisionDTO revision = new RevisionDTO();
        revision.setVersion(0L);
        this.connectionEntity.setRevision(revision);

        // set source and destination
        ConnectionDTO component = new ConnectionDTO();

        ConnectableDTO sourceConnection = new ConnectableDTO();
        sourceConnection.setId(parameterList.get(0));
        sourceConnection.setGroupId(this.parentGroupId);
        sourceConnection.setType(ConnectableDTO.TypeEnum.PROCESSOR);
        component.setSource(sourceConnection);

        ConnectableDTO destinationConnection = new ConnectableDTO();
        destinationConnection.setId(parameterList.get(1));
        destinationConnection.setGroupId(this.parentGroupId);
        destinationConnection.setType(ConnectableDTO.TypeEnum.PROCESSOR);
        component.setDestination(destinationConnection);

        // set selectedRelationships
        List<String> selectedRelationships = new ArrayList<>();
        selectedRelationships.add("success");
        component.setSelectedRelationships(selectedRelationships);

        component.setFlowFileExpiration("0 sec");
        component.setBackPressureDataSizeThreshold("1 GB");
        component.setBackPressureObjectThreshold(10000L);
        component.setLoadBalanceStrategy(ConnectionDTO.LoadBalanceStrategyEnum.DO_NOT_LOAD_BALANCE);
        component.setLoadBalanceCompression(ConnectionDTO.LoadBalanceCompressionEnum.DO_NOT_COMPRESS);

        this.connectionEntity.setComponent(component);
    }

    @Override
    public void setParameters(JSONObject parameterJson) {

    }


    @Override
    public NifiResponse commit() throws ApiException {
        ProcessGroupsApi processGroupsApi = new ProcessGroupsApi();
        processGroupsApi.setApiClient(NifiClient.getClient());
        ConnectionEntity resultEntity = processGroupsApi.createConnection(this.parentGroupId, this.connectionEntity);

        NifiResponse response = new NifiResponse();
        response.setReplyMessage("Processor created!");
        response.setReturnObject(resultEntity);
        return response;
    }

}
