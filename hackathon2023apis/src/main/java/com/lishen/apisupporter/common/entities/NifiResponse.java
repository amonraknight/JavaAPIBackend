package com.lishen.apisupporter.common.entities;

public class NifiResponse {
    public NifiResponse() {

    }

    public NifiResponse(String replyMessage, Object nifiResponse) {
        this.nifiResponse = nifiResponse;
        this.replyMessage = replyMessage;
    }

    private Object nifiResponse;
    private String replyMessage;


    public Object getNifiResponse() {
        return nifiResponse;
    }

    public void setNifiResponse(Object nifiResponse) {
        this.nifiResponse = nifiResponse;
    }

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
    }
}
