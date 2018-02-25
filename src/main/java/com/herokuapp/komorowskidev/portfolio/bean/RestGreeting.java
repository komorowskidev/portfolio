package com.herokuapp.komorowskidev.portfolio.bean;

/**
 * obiekt RESTowy
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
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
