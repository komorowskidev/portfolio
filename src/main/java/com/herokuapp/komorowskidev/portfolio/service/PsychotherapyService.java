package com.herokuapp.komorowskidev.portfolio.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.herokuapp.komorowskidev.portfolio.bean.PageHeader;
import com.herokuapp.komorowskidev.portfolio.bean.PageJumbotron;
import com.herokuapp.komorowskidev.portfolio.bean.PageNav;

/**
 * serwis danych podstrony o psychoterapii
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Component
public class PsychotherapyService implements PageService {

	@Value("${psychotherapy.metaTitle}")
	private String metaTitle = "";
	
	@Value("${psychotherapy.metaDescription}")
	private String metaDescription = "";
	
	@Value("${psychotherapy.metaKeywords}")
	private String metaKeywords = "";
	
	@Value("${psychotherapy.navUrl}")
	private String navUrl = "";
	
	@Value("${psychotherapy.navTitle}")
	private String navTitle = "";
	
	@Value("${psychotherapy.navDescription}")
	private String navDescription = "";
	
	@Value("${psychotherapy.jumbotronTitle}")
	private String jumbotronTitle = "";
	
	@Value("${psychotherapy.jumbotronDescription}")
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
