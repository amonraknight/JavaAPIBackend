package com.lishen.apisupporter.services;

import com.lishen.apisupporter.common.entities.Exp;
import com.lishen.apisupporter.common.entities.ExpConfigBean;
import com.lishen.apisupporter.common.entities.NifiResponse;
import com.lishen.apisupporter.common.nifiapi.ApiException;
import com.lishen.apisupporter.services.nifiservices.NifiService;
import com.lishen.apisupporter.services.nifiservices.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class QuestionParsor {
    @Autowired
    private ExpConfigBean regxs;

    @Autowired
    private ServiceFactory serviceFactory;

    public String parseQuestionNdAct(String question) throws ApiException {
        NifiService expectedService = getExpectedService(question);
        NifiResponse response = null;
        if(expectedService==null) {
            String replyMessage = "Sorry, can't find a service for your.";
            response = new NifiResponse(replyMessage, null);
        }
        else {
            response = expectedService.commit();
        }

        return response.getReplyMessage();
    }

    private NifiService getExpectedService(String question) {
        List<Exp> regxList = regxs.getExplist();
        String expectedService="Not Found";
        List<String> parameters = new ArrayList<>();
        for (Exp regex : regxList) {
            Pattern pattern = Pattern.compile(regex.getRegex());
            Matcher matcher = pattern.matcher(question);

            if(matcher.find()) {
                expectedService = regex.getTask();
                for(int i=regex.getGroupNumberCount(); i>0; i--) {
                    parameters.add(matcher.group(i));
                }

                break;
            }
        }

        NifiService service= serviceFactory.createNifiService(expectedService);
        if(service!=null) {
            service.setParameters(parameters);
        }

        return service;
    }
}
