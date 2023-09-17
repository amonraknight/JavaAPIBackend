package com.lishen.apisupporter.services.nifiservices;

import com.alibaba.fastjson2.JSONObject;
import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;

import java.util.List;

public class ServiceCreateConnection implements NifiService{
    private String parentGroupId;


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

    }


    @Override
    public NifiResponse commit() throws ApiException {
        return null;
    }

}
