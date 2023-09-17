package com.lishen.apisupporter.common.entities;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "component")
public class NifiComponents {
    List<NifiComponent> list;

    public String getClassNameByType(String type) {
        for(NifiComponent eachComponent: this.list) {
            if(eachComponent.getType().equalsIgnoreCase(type)) {
                return eachComponent.getClassfile();
            }
        }
        return null;
    }
}
