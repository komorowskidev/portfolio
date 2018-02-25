package com.herokuapp.komorowskidev.portfolio.bean;

/**
 * objekt do budowania navbar
 * przechowuje dane nawigacyjne potrzebne na każdej podstronie
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public class NavBean {

	private PageNav index;
	private PageNav psychotherapy;
	private PageNav programming;
	private PageNav beekeeping;
	
	public NavBean(PageNav index, PageNav psychotherapy, PageNav programming, PageNav beekeeping) {
		this.index = index;
		this.psychotherapy = psychotherapy;
		this.programming = programming;
		this.beekeeping = beekeeping;
	}

	public PageNav getIndex() {
		return index;
	}

	public PageNav getPsychotherapy() {
		return psychotherapy;
	}

	public PageNav getProgramming() {
		return programming;
	}

	public PageNav getBeekeeping() {
		return beekeeping;
	}

}
