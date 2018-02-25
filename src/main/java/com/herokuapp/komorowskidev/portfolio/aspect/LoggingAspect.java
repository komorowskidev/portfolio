package com.herokuapp.komorowskidev.portfolio.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * klasa aspectowa, loguje wejścia na podstrony
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Aspect
@Component
public class LoggingAspect {
	
	final Logger logger = LoggerFactory.getLogger(getClass());

	@Before("execution(* index(..))")
	public void beforeIndex() {
		logger.debug("==> entering index");
	}
	
	@Before("execution(* psychotherapy(..))")
	public void beforePsychotherapy() {
		logger.debug("==> entering psychotherapy");
	}
	
	@Before("execution(* programming(..))")
	public void beforeProgramming() {
		logger.debug("==> entering programming");
	}
	
	@Before("execution(* beekeeping(..))")
	public void beforeBeekeeping() {
		logger.debug("==> entering beekeeping");
	}
	
	@Before("execution(* sectionAdmin(..))")
	public void beforeSectionAdmin() {
		logger.debug("==> entering section admin");
	}
	
	@Before("execution(* login(..))")
	public void beforeLogin() {
		logger.debug("==> entering user login form");
	}
	
	@Before("execution(* showFormForAdd(..))")
	public void beforeAddForm() {
		logger.debug("==> entering add event form");
	}
	
	@Before("execution(* showFormForUpdate(..))")
	public void beforeUpdateForm() {
		logger.debug("==> entering update event form");
	}
	
	@Before("execution(* deleteEvent(..))")
	public void beforeDeleteEvent() {
		logger.debug("==> deleting event");
	}
	
	@Before("execution(* saveEvent(..))")
	public void beforeSaveEvent() {
		logger.debug("==> saving event");
	}
}
