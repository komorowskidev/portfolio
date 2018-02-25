package com.herokuapp.komorowskidev.portfolio.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.herokuapp.komorowskidev.portfolio.bean.PageHeader;
import com.herokuapp.komorowskidev.portfolio.bean.PageJumbotron;
import com.herokuapp.komorowskidev.portfolio.bean.PageNav;

/**
 * serwis danych podstrony o pszczelarstwie
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Component
public class BeekeepingService implements PageService {

	@Value("${beekeeping.metaTitle}")
	private String metaTitle = "";
	
	@Value("${beekeeping.metaDescription}")
	private String metaDescription = "";
	
	@Value("${beekeeping.metaKeywords}")
	private String metaKeywords = "";
	
	@Value("${beekeeping.navUrl}")
	private String navUrl = "";
	
	@Value("${beekeeping.navTitle}")
	private String navTitle = "";
	
	@Value("${beekeeping.navDescription}")
	private String navDescription = "";
	
	@Value("${beekeeping.jumbotronTitle}")
	private String jumbotronTitle = "";
	
	@Value("${beekeeping.jumbotronDescription}")
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
