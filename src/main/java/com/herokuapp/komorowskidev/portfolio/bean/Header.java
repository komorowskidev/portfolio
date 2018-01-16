package com.herokuapp.komorowskidev.portfolio.bean;

/**
 * klasa przechowująca dane do linków menu w nagłówku
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public class Header {
	
	private String[] url; //adres do mapowania
	private String[] title; //nazwa
	
	public Header(int length) {
		url = new String[length];
		title = new String[length];
	}

	public String[] getUrl() {
		return url;
	}

	public void setUrl(String[] url) {
		this.url = url;
	}

	public String[] getTitle() {
		return title;
	}

	public void setTitle(String[] title) {
		this.title = title;
	}
}
