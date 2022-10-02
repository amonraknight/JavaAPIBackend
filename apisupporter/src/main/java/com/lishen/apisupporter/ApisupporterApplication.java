package com.lishen.apisupporter;

import com.lishen.apisupporter.commonutil.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class ApisupporterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApisupporterApplication.class, args);
    }

}
