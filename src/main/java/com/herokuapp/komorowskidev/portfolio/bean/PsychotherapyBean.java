package com.herokuapp.komorowskidev.portfolio.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * klasa przechowuje dane związane z działu psychoterapia
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Component
public class PsychotherapyBean {
	
	protected final String SECTION = "psychotherapy";
	
	@Value("${" + SECTION + ".title}")
	private String title = "";
	
	@Value("${" + SECTION + ".description}")
	private String description = "";
	
	@Value("${" + SECTION + ".person}")
	private String person = "";

	@Value("${" + SECTION + ".html}")
	private String html = "";
	
	private String url = "";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	
	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
