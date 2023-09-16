package com.lishen.apisupporter.controllers;


import com.lishen.apisupporter.common.entities.MyRequestBody;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.services.QuestionParsor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController()
@RequestMapping("/chat")
public class ChatApis {
    @Autowired
    QuestionParsor questionParserService;

    @PostMapping("/postMessage")
    public String postMessageToChat(@RequestBody MyRequestBody body) throws ApiException {
        String question = body.getQuestion();
        log.debug("question: s%", question);
        return questionParserService.parseQuestionNdAct(question);
    }
}
