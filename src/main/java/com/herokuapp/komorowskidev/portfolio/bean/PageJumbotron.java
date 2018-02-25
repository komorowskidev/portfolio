package com.herokuapp.komorowskidev.portfolio.bean;

/**
 * przechowuje tekst dla obszaru jumbotron
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public class PageJumbotron {

	private String title;
	private String description;
	
	public PageJumbotron(String jumbotronTitle, String jumbotronDescription) {
		this.title = jumbotronTitle;
		this.description = jumbotronDescription;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
}
