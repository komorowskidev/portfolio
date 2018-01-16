package com.herokuapp.komorowskidev.portfolio.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * klasa aspectowa, pokazuje wejścia na podstrony
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
	
	@Before("execution(* section0(..))")
	public void beforeSection0() {
		logger.debug("==> entering section 0");
	}
	
	@Before("execution(* section1(..))")
	public void beforeSection1() {
		logger.debug("==> entering section 1");
	}
	
	@Before("execution(* section2(..))")
	public void beforeSection2() {
		logger.debug("==> entering section 2");
	}
	
	@Before("execution(* sectionAdmin(..))")
	public void beforeSectionAdmin() {
		logger.debug("==> entering section admin");
	}
}
