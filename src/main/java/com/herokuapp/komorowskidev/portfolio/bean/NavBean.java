package com.herokuapp.komorowskidev.portfolio.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * objekt do budowania navbar
 * przechowuje dane potrzebne na każdej podstronie
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Component
public class NavBean {

	@Value("${nav.url0}")
	private String url0 = "";
	
	@Value("${nav.name0}")
	private String name0 = "";
	
	@Value("${nav.description0}")
	private String description0 = "";
	
	@Value("${nav.person0}")
	private String person0 = "";
	
	@Value("${nav.url1}")
	private String url1 = "";
	
	@Value("${nav.name1}")
	private String name1 = "";
	
	@Value("${nav.description1}")
	private String description1 = "";
	
	@Value("${nav.person1}")
	private String person1 = "";
	
	@Value("${nav.url2}")
	private String url2 = "";
	
	@Value("${nav.name2}")
	private String name2 = "";
	
	@Value("${nav.description2}")
	private String description2 = "";
	
	@Value("${nav.person2}")
	private String person2 = "";
	
	@Value("${nav.url3}")
	private String url3 = "";
	
	@Value("${nav.name3}")
	private String name3 = "";
	
	@Value("${nav.description3}")
	private String description3 = "";
	
	@Value("${nav.person3}")
	private String person3 = "";

	public String getUrl0() {
		return url0;
	}

	public void setUrl0(String url0) {
		this.url0 = url0;
	}

	public String getName0() {
		return name0;
	}

	public void setName0(String name0) {
		this.name0 = name0;
	}

	public String getDescription0() {
		return description0;
	}

	public void setDescription0(String description0) {
		this.description0 = description0;
	}

	public String getPerson0() {
		return person0;
	}

	public void setPerson0(String person0) {
		this.person0 = person0;
	}

	public String getUrl1() {
		return url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getPerson1() {
		return person1;
	}

	public void setPerson1(String person1) {
		this.person1 = person1;
	}

	public String getUrl2() {
		return url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getPerson2() {
		return person2;
	}

	public void setPerson2(String person2) {
		this.person2 = person2;
	}

	public String getUrl3() {
		return url3;
	}

	public void setUrl3(String url3) {
		this.url3 = url3;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getDescription3() {
		return description3;
	}

	public void setDescription3(String description3) {
		this.description3 = description3;
	}

	public String getPerson3() {
		return person3;
	}

	public void setPerson3(String person3) {
		this.person3 = person3;
	}

	
}
