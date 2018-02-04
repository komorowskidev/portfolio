package com.herokuapp.komorowskidev.portfolio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.herokuapp.komorowskidev.portfolio.bean.RestGreeting;

/**
 * kontroler REST
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@RestController
public class RestGreetingController {
	
	private final String template = "Hello, %s!";
	private final String signature = "Krzysztof Świerkosz-Komorowski";
	
	@RequestMapping("/greeting")
    public RestGreeting greeting(@RequestParam(value="name", defaultValue="stranger") String name) {
        return new RestGreeting(String.format(template, name), signature);
    }

}
