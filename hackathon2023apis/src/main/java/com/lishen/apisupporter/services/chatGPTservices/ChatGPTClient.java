package com.lishen.apisupporter.services.chatGPTservices;


import com.lishen.apisupporter.common.util.OkHttpUtil;
import com.squareup.okhttp.OkHttpClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class ChatGPTClient {

    private OkHttpClient okHttpClient;

    @PostConstruct
    private void init() {
        log.info("ChatGPTClient initiating.");
        okHttpClient = OkHttpUtil.getUnsafeOkHttpClient();
        log.info("ChatGPTClient initiated.");
    }


    public OkHttpClient getClient() {
        return okHttpClient;
    }

}
