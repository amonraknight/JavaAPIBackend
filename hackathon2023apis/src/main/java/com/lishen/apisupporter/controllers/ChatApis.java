package com.lishen.apisupporter.controllers;


import com.lishen.apisupporter.commonutil.entities.MyRequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController()
@RequestMapping("/chat")
public class ChatApis {
    @PostMapping("/postMessage")
    public String postMessageToChat(@RequestBody MyRequestBody body){
        log.debug("question: s%", body.getQuestion());
        return "OK";
    }
}
