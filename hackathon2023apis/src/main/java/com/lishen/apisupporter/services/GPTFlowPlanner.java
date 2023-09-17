package com.lishen.apisupporter.services;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONArray;
import com.lishen.apisupporter.common.entities.GPTDesignComponent;
import com.lishen.apisupporter.common.entities.NifiComponents;
import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.common.nifiapi.model.ProcessorEntity;
import com.lishen.apisupporter.services.chatGPTservices.ChatGPTService;
import com.lishen.apisupporter.services.nifiservices.ServiceCreateProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class GPTFlowPlanner {

    @Autowired
    ChatGPTService chatGPTService;

    @Autowired
    NifiComponents nifiComponents;

    @Value("${nifi.parent-group-id}")
    private String parentGroupId;

    @Value("${nifi.position.step}")
    private int positionStep;

    public String createFlowAccordingToChatGPTsDesign(String inputMessage) {
        String gptDesign = chatGPTService.AskGPTFlowDesign(inputMessage);


        try {
            JSONArray jsonArray = JSONArray.parseArray(gptDesign);
            List<GPTDesignComponent> componentList = jsonArray.toJavaList(GPTDesignComponent.class);

            createNifiFlow(componentList);
        } catch (Exception e) {
            log.error("ChatGPT is not returning an expected answer.", e, gptDesign);
        }

        return null;
    }

    ;

    private String createNifiFlow(List<GPTDesignComponent> componentList) {

        List<ProcessorEntity> processorList = new ArrayList<>();

        // Create processor one by one.
        for (int i = 0; i < componentList.size(); i++) {
            GPTDesignComponent eachComponent = componentList.get(i);
            eachComponent = integrateComponent(eachComponent, i + 1);
            ServiceCreateProcessor serviceCreateProcessor = new ServiceCreateProcessor();
            serviceCreateProcessor.setParentGroupId(this.parentGroupId);
            serviceCreateProcessor.setProcessorType(eachComponent.getType());
            serviceCreateProcessor.setParameters(eachComponent.getParameters());

            try {
                NifiResponse nifiResponse = serviceCreateProcessor.commit();
                processorList.add((ProcessorEntity) nifiResponse.getReturnObject());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        }

        return "The flow has been created.";
    }

    private GPTDesignComponent integrateComponent(GPTDesignComponent component, int idx) {

        JSONObject parameterJson = component.getParameters();
        parameterJson.put("name", component.getType().concat("_").concat(String.valueOf(idx)));

        String classfile = this.nifiComponents.getClassNameByType(component.getType());
        parameterJson.put("classfile", classfile);

        parameterJson.put("positionStep", positionStep);

        component.setParameters(parameterJson);

        return component;
    }

}
