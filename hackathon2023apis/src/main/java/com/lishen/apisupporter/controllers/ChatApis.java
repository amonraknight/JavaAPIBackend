package com.lishen.apisupporter.controllers;


import com.lishen.apisupporter.common.entities.MyRequestBody;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.services.GPTFlowPlanner;
import com.lishen.apisupporter.services.QuestionParsor;
import com.lishen.apisupporter.services.chatGPTservices.ChatGPTService;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController()
@RequestMapping("/chat")
public class ChatApis {
    @Autowired
    QuestionParsor questionParserService;

    @Autowired
    GPTFlowPlanner gptFlowPlanner;

    @Value("${nlu.target}")
    String nluTarget;

    @PostMapping("/postMessage")
    public String postMessageToChat(@RequestBody MyRequestBody body) throws ApiException {
        String question = body.getQuestion();
        log.debug("question: s%", question);

        String replyMessage = "";
        // Choose the nlu target here:
        switch (nluTarget) {
            case "regular_expression":
                replyMessage = questionParserService.parseQuestionNdAct(question);
                break;
            case "chatgpt_ss":
                // replyMessage = chatGPTService.AskGPTFlowDesign(question);
                replyMessage = gptFlowPlanner.createFlowAccordingToChatGPTsDesign(question);
                break;
        }


        return replyMessage;
    }
}
