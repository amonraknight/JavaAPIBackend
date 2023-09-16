package com.lishen.apisupporter.services.nifiservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {

    @Value("${nifi.parent-group-id}")
    private String parentGroupId;

    public NifiService createNifiService(String serviceName) {
        NifiService tgtService = null;
        switch (serviceName) {
            case "createProcessorGroup":
                tgtService = new ServiceCreateProcessorGroup();
                ((ServiceCreateProcessorGroup) tgtService).setParentGroupId(parentGroupId);
                break;
            case "deleteProcessorGroup":
                tgtService = new ServiceDeleteProcessorGroup();
                ((ServiceDeleteProcessorGroup) tgtService).setParentGroupId(parentGroupId);
                break;
            default:
                break;
        }
        return tgtService;
    }
}
