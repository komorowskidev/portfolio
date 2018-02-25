package com.herokuapp.komorowskidev.portfolio.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.herokuapp.komorowskidev.portfolio.bean.PageHeader;
import com.herokuapp.komorowskidev.portfolio.bean.PageJumbotron;
import com.herokuapp.komorowskidev.portfolio.bean.PageNav;

/**
 * serwis danych dla podstrony o programowaniu
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Component
public class ProgrammingService implements PageService {

	@Value("${programming.metaTitle}")
	private String metaTitle = "";
	
	@Value("${programming.metaDescription}")
	private String metaDescription = "";
	
	@Value("${programming.metaKeywords}")
	private String metaKeywords = "";
	
	@Value("${programming.navUrl}")
	private String navUrl = "";
	
	@Value("${programming.navTitle}")
	private String navTitle = "";
	
	@Value("${programming.navDescription}")
	private String navDescription = "";
	
	@Value("${programming.jumbotronTitle}")
	private String jumbotronTitle = "";
	
	@Value("${programming.jumbotronDescription}")
	private String jumbotronDescription = "";
	
	@Override
	public PageHeader getHeader() {
		return new PageHeader(metaTitle, metaDescription, metaKeywords);
	}

	@Override
	public PageNav getNav() {
		return new PageNav(navUrl, navTitle, navDescription);
	}

	@Override
	public PageJumbotron getJumbotron() {
		return new PageJumbotron(jumbotronTitle, jumbotronDescription);
	}
}
