package com.lishen.apisupporter.services;

import com.alibaba.fastjson2.JSONArray;
import com.lishen.apisupporter.common.entities.GPTDesignComponent;
import com.lishen.apisupporter.services.chatGPTservices.ChatGPTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class GPTFlowPlanner {

    @Autowired
    ChatGPTService chatGPTService;

    public String createFlowAccordingToChatGPTsDesign(String inputMessage) {
        String gptDesign = chatGPTService.AskGPTFlowDesign(inputMessage);


        try {
            JSONArray jsonArray = JSONArray.parseArray(gptDesign);
            List<GPTDesignComponent> componentList = jsonArray.toJavaList(GPTDesignComponent.class);

            createNifiFlow(componentList);
        } catch (Exception e) {
            log.error("ChatGPT is not returning an expected answer.", gptDesign);
        }

        return null;
    };

    private String createNifiFlow(List<GPTDesignComponent> componentList) {

    }

}
