package com.lishen.apisupporter.services.nifiservices;

import com.lishen.apisupporter.common.entities.NifiResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ServiceDeleteProcessorGroup implements NifiService {

    @Override
    public void setParameters(List<String> parameterList) {

    }

    @Override
    public NifiResponse commit() {
        log.debug("ServiceDeleteProcessorGroup is executed!");
        return null;
    }
}
