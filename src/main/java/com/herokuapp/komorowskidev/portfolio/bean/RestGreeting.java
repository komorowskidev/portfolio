package com.herokuapp.komorowskidev.portfolio.bean;

public class RestGreeting {

    private final String content;
    private final String signature;

    public RestGreeting(String content, String signature) {
        this.content = content;
        this.signature = signature;
    }

    public String getContent() {
        return content;
    }
    
    public String getSignature() {
    	return signature;
    }
}
