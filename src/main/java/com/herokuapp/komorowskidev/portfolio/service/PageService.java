package com.herokuapp.komorowskidev.portfolio.service;

import com.herokuapp.komorowskidev.portfolio.bean.PageHeader;
import com.herokuapp.komorowskidev.portfolio.bean.PageJumbotron;
import com.herokuapp.komorowskidev.portfolio.bean.PageNav;

/**
 * interfejs serwisu danych dla podstron www
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public interface PageService {
	
	public PageHeader getHeader();

	public PageNav getNav();
	
	public PageJumbotron getJumbotron();

}
