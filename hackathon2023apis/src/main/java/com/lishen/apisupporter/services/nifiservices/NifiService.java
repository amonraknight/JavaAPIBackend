package com.lishen.apisupporter.services.nifiservices;

import com.alibaba.fastjson2.JSONObject;
import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NifiService {

    public void setParameters(List<String> parameterList);

    public void setParameters(JSONObject parameterJson);

    public NifiResponse commit() throws ApiException;
}
