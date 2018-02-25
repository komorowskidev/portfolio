package com.herokuapp.komorowskidev.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.herokuapp.komorowskidev.portfolio.bean.NavBean;
import com.herokuapp.komorowskidev.portfolio.entity.Events;
import com.herokuapp.komorowskidev.portfolio.service.BeekeepingService;
import com.herokuapp.komorowskidev.portfolio.service.EventsService;
import com.herokuapp.komorowskidev.portfolio.service.IndexService;
import com.herokuapp.komorowskidev.portfolio.service.ProgrammingService;
import com.herokuapp.komorowskidev.portfolio.service.PsychotherapyService;

/**
 * główny kontroler aplikacji
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Controller
public class MainController {
	
	@Autowired
	private EventsService eventsService;
	
	@Autowired
	private IndexService indexService;
	
	@Autowired
	private PsychotherapyService psychotherapyService;
	
	@Autowired
	private ProgrammingService programmingService;

	@Autowired
	private BeekeepingService beekeepingService;
	
	@GetMapping("/")
    public String index(Model model) {
    	model.addAttribute("fragment", "fragments/index :: contents");
    	model.addAttribute("header", indexService.getHeader());
    	model.addAttribute("nav", getNav());
    	model.addAttribute("jumbotron", indexService.getJumbotron());
    	model.addAttribute("jumbotronPsychotherapy", psychotherapyService.getJumbotron());
    	model.addAttribute("jumbotronProgramming", programmingService.getJumbotron());
    	model.addAttribute("jumbotronBeekeeping", beekeepingService.getJumbotron());
    	return "layout";
    }
	
	@GetMapping("/psychoterapia")
    public String psychotherapy(Model model) {
		model.addAttribute("fragment", "fragments/psychotherapy :: contents");
		model.addAttribute("header", psychotherapyService.getHeader());
    	model.addAttribute("nav", getNav());
    	model.addAttribute("jumbotron", psychotherapyService.getJumbotron());
    	return "layout";
    }
	
	@GetMapping("/programowanie")
    public String programming(Model model) {
		model.addAttribute("fragment", "fragments/programming :: contents");
		model.addAttribute("header", programmingService.getHeader());
		model.addAttribute("nav", getNav());
		model.addAttribute("jumbotron", programmingService.getJumbotron());
		Iterable<Events> events = eventsService.getEvents();
    	model.addAttribute("events", events);
    	return "layout";
    }
	
	@GetMapping("/pszczelarstwo")
    public String beekeeping(Model model) {
		model.addAttribute("fragment", "fragments/beekeeping :: contents");
		model.addAttribute("header", beekeepingService.getHeader());
    	model.addAttribute("nav", getNav());
    	model.addAttribute("jumbotron", beekeepingService.getJumbotron());
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
	
	private NavBean getNav() {
		return new NavBean(
				indexService.getNav(), 
				psychotherapyService.getNav(),
				programmingService.getNav(),
				beekeepingService.getNav());
	}
	
}
