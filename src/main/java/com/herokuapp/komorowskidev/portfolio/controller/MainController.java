package com.herokuapp.komorowskidev.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.herokuapp.komorowskidev.portfolio.bean.BeekeepingBean;
import com.herokuapp.komorowskidev.portfolio.bean.Header;
import com.herokuapp.komorowskidev.portfolio.bean.ProgrammingBean;
import com.herokuapp.komorowskidev.portfolio.bean.PsychotherapyBean;
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
	private PsychotherapyBean section0;
	private final String SECTION0URL = "/psychoterapia";
	
	@Autowired
	private ProgrammingBean section1;
	private final String SECTION1URL = "/programowanie";
	
	@Autowired
	private BeekeepingBean section2;
	private final String SECTION2URL = "/pasieka";
	
	@Autowired
	private EventsService eventsService;
	
    @RequestMapping("/")
    public String index(Model model) {
    	model.addAttribute("header", getHeader());
    	model.addAttribute("section0", section0);
    	model.addAttribute("section1", section1);
    	model.addAttribute("section2", section2);
        return "index";
    }
    
	@GetMapping(SECTION0URL)
    public String section0(Model model) {
		setAttr(model, "section0", section0);
    	return section0.getHtml();
    }
    
    @GetMapping(SECTION1URL)
    public String section1(Model model) {
    	setAttr(model, "section1", section1);
    	Iterable<Events> events = eventsService.getEvents();
    	model.addAttribute("events", events);
    	return section1.getHtml();
    }
    
    @GetMapping(SECTION2URL)
    public String section2(Model model) {
    	setAttr(model, "section2", section2);
    	return section2.getHtml();
    }
    
    @GetMapping("/admin")
    public String sectionAdmin(Model model) {
    	Iterable<Events> events = eventsService.getEvents();
    	setAttr(model, "events", events);
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
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") long id, Model model) {
		eventsService.delete(id);
		return "redirect:/admin"; 
	}
	
	@PostMapping("/saveEvent")
	public String saveEvent(@ModelAttribute("event") Events event) {
		eventsService.saveEvent(event);
		return "redirect:/admin";
	}
    
    private void setAttr(Model model, String sectionNumber, Object section) {
    	model.addAttribute("header", getHeader());
    	model.addAttribute(sectionNumber, section);
    }
    
    private Header getHeader() {
    	Header header = new Header(3);
    	String[] title = {section0.getTitle(), section1.getTitle(), section2.getTitle()};
    	String[] url = {SECTION0URL, SECTION1URL, SECTION2URL};
    	header.setTitle(title);
    	header.setUrl(url);
    	return header;
	}

}
