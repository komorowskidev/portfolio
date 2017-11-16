package com.herokuapp.komorowskidev.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
    @RequestMapping("/")
    public String index(Model model) {
    	String name = "test";
    	model.addAttribute("name", name);
        return "index";
    }

}
