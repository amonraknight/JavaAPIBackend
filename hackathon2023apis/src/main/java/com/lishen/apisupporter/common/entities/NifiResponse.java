package com.lishen.apisupporter.common.entities;

public class NifiResponse {
    public NifiResponse() {

    }

    public NifiResponse(String replyMessage, Object nifiResponse) {
        this.returnObject = nifiResponse;
        this.replyMessage = replyMessage;
    }

    private Object returnObject;
    private String replyMessage;


    public Object getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(Object returnObject) {
        this.returnObject = returnObject;
    }

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
    }
}
