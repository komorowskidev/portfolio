package com.herokuapp.komorowskidev.portfolio.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * klasa przechowuje dane z podstrony
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Component
public class Section2 {
	
protected final String SECTION = "section2";
	
	@Value("${" + SECTION + ".metaTitle}")
	private String metaTitle = "";
	
	@Value("${" + SECTION + ".metaDescription}")
	private String metaDescription = "";
	
	@Value("${" + SECTION + ".metaKeywords}")
	private String metaKeywords = "";
	
	@Value("${" + SECTION + ".title}")
	private String title = "";

	public String getMetaTitle() {
		return metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSECTION() {
		return SECTION;
	}
	

}
