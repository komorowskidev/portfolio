package com.herokuapp.komorowskidev.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.herokuapp.komorowskidev.portfolio.bean.MetaBean;
import com.herokuapp.komorowskidev.portfolio.bean.NavBean;
import com.herokuapp.komorowskidev.portfolio.bean.Section0;
import com.herokuapp.komorowskidev.portfolio.bean.Section1;
import com.herokuapp.komorowskidev.portfolio.bean.Section2;
import com.herokuapp.komorowskidev.portfolio.bean.Section3;
import com.herokuapp.komorowskidev.portfolio.entity.Events;
import com.herokuapp.komorowskidev.portfolio.service.EventsService;

/**
 * główny kontroler aplikacji
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Controller
public class MainController {
	
	@Autowired
	private Section0 section0;
	
	@Autowired
	private Section1 section1;
	
	@Autowired
	private Section2 section2;
	
	@Autowired
	private Section3 section3;
	
	@Autowired
	private NavBean nav;
	
	private final String SECTION1URL = "/psychoterapia";
	private final String SECTION2URL = "/programowanie";
	private final String SECTION3URL = "/pszczelarstwo";
	
	@Autowired
	private EventsService eventsService;

	@GetMapping("/")
    public String index(Model model) {
    	MetaBean meta = new MetaBean(
    			section0.getMetaTitle(), 
    			section0.getMetaDescription(), 
    			section0.getMetaKeywords());
    	String fragment = "fragments/section0 :: contents";
    	model.addAttribute("meta", meta);
    	model.addAttribute("nav", nav);
    	model.addAttribute("fragment", fragment);
    	model.addAttribute("section", section0);
    	return "layout";
    }
	
	@GetMapping(SECTION1URL)
    public String section1(Model model) {
		MetaBean meta = new MetaBean(
    			section1.getMetaTitle(), 
    			section1.getMetaDescription(), 
    			section1.getMetaKeywords());
    	String fragment = "fragments/section1 :: contents";
    	model.addAttribute("meta", meta);
    	model.addAttribute("nav", nav);
    	model.addAttribute("fragment", fragment);
    	model.addAttribute("section", section1);
    	return "layout";
    }
	
	@GetMapping(SECTION2URL)
    public String section2(Model model) {
		MetaBean meta = new MetaBean(
    			section2.getMetaTitle(), 
    			section2.getMetaDescription(), 
    			section2.getMetaKeywords());
    	String fragment = "fragments/section2 :: contents";
    	Iterable<Events> events = eventsService.getEvents();
    	model.addAttribute("events", events);
    	model.addAttribute("meta", meta);
    	model.addAttribute("nav", nav);
    	model.addAttribute("fragment", fragment);
    	model.addAttribute("section", section2);
    	return "layout";
    }
	
	@GetMapping(SECTION3URL)
    public String section3(Model model) {
		MetaBean meta = new MetaBean(
    			section3.getMetaTitle(), 
    			section3.getMetaDescription(), 
    			section3.getMetaKeywords());
    	String fragment = "fragments/section3 :: contents";
    	model.addAttribute("meta", meta);
    	model.addAttribute("nav", nav);
    	model.addAttribute("fragment", fragment);
    	model.addAttribute("section", section3);
    	return "layout";
    }
    
    @GetMapping("/admin")
    public String sectionAdmin(Model model) {
    	Iterable<Events> events = eventsService.getEvents();
    	model.addAttribute("events", events);
    	model.addAttribute("editable", true);
    	return "admin";
    }
    
    @GetMapping("/login")
    public String login() {
    	return "login";
    }
    
    @GetMapping("/logout")
    public String logout(Model model) {
    	model.addAttribute("logout", true);
    	return "login";
    }
    
    @GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Events event = new Events();
		model.addAttribute("event", event);
		return "event-form";
	}
    
    @GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") long id, Model model) {
		Events event = eventsService.getEvent(id);
		model.addAttribute("event", event);
		return "event-form";
	}
	
	@GetMapping("/deleteEvent")
	public String deleteEvent(@RequestParam("id") long id, Model model) {
		eventsService.delete(id);
		return "redirect:/admin"; 
	}
	
	@PostMapping("/saveEvent")
	public String saveEvent(@ModelAttribute("event") Events event) {
		eventsService.saveEvent(event);
		return "redirect:/admin";
	}
	
}
