package com.herokuapp.komorowskidev.portfolio.bean;

/**
 * przechowuje tekst dla pól meta w nagłówku strony html
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public class PageHeader {
	
	private String metaTitle;
	private String metaDescription;
	private String metaKeywords;
	
	public PageHeader(String metaTitle, String metaDescription, String metaKeywords) {
		this.metaTitle = metaTitle;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
	}

	public String getMetaTitle() {
		return metaTitle;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

}
