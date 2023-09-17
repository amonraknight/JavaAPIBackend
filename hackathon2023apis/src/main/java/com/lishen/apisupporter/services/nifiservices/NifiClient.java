package com.lishen.apisupporter.services.nifiservices;

import com.lishen.apisupporter.common.nifiapi.ApiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class NifiClient {

    private static ApiClient client;

    @Value("${nifi.baseurl}")
    String baseurl;

    @PostConstruct
    private void init() {
        log.info("NifiAccess initiating.");
        client = new ApiClient();
        client.setDebugging(true);
        // client.addDefaultHeader("Authorization", getBasicAuthenticationHeader("admin", "adminadminadmin"));
        client.setBasePath(baseurl);
        log.info("NifiAccess initiated.");
    }


    public static ApiClient getClient() {
        return client;
    }

}
