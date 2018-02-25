package com.herokuapp.komorowskidev.portfolio.bean;

/**
 * przechowuje dane nawigacyjne podstrony
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public class PageNav {
	
	private String url;
	private String title;
	private String description;
	
	public PageNav(String navUrl, String navTitle, String navDescription) {
		this.url = navUrl;
		this.title = navTitle;
		this.description = navDescription;
	}
	
	public String getUrl() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
}
