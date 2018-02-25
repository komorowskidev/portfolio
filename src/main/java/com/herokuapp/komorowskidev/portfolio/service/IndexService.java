package com.herokuapp.komorowskidev.portfolio.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.herokuapp.komorowskidev.portfolio.bean.PageHeader;
import com.herokuapp.komorowskidev.portfolio.bean.PageJumbotron;
import com.herokuapp.komorowskidev.portfolio.bean.PageNav;

/**
 * serwis danych podstrony domowej
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Component
public class IndexService implements PageService {

	@Value("${index.metaTitle}")
	private String metaTitle = "";
	
	@Value("${index.metaDescription}")
	private String metaDescription = "";
	
	@Value("${index.metaKeywords}")
	private String metaKeywords = "";
	
	@Value("${index.navUrl}")
	private String navUrl = "";
	
	@Value("${index.navTitle}")
	private String navTitle = "";
	
	@Value("${index.navDescription}")
	private String navDescription = "";
	
	@Value("${index.jumbotronTitle}")
	private String jumbotronTitle = "";
	
	@Value("${index.jumbotronDescription}")
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
