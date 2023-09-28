package com.lishen.apisupporter.services.chatGPTservices;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import lombok.extern.slf4j.Slf4j;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class ChatGPTService {

    @Value("${nlu.chatgpt.url}")
    String baseurl;

    @Value("${chatgpt.prompt.template}")
    String promptTemplate;

    @Value("${nlu.chatgpt.skip}")
    boolean skip;

    @Value("${nlu.chatgpt.dummy}")
    String dummyReturn;

    @Autowired
    ChatGPTClient chatGPTClient;


    private String postMessageToGPT(String message) {
        JSONObject obj =new JSONObject();
        obj.put("message", message);
        String JsonString = obj.toString();
        MediaType type = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = RequestBody.create(type, JsonString);

        Request request = new Request.Builder()
                .post(requestBody)
                .url(baseurl).build();
        String jsonString = null;
        try {

            Response postReponse = chatGPTClient.getClient().newCall(request).execute();
            jsonString = postReponse.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return jsonString;
    }

    public String AskGPTFlowDesign(String userInput) {

        if (skip) {
            return dummyReturn;
        }
        // Fill prompt:
        String prompt = String.format(promptTemplate, userInput);

        String reply = postMessageToGPT(prompt);

        JSONObject responseObj = JSON.parseObject(reply);

        return responseObj.get("message").toString();
    }

}
