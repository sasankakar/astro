package com.astro.horoscope.domain;

public class GrahaDetails {
	private int id;
	private String nameOriya;
	private String nameEnglish;
	private String shortNameOriya;
	private String shortNameEnglish;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOriya() {
		return nameOriya;
	}
	public void setNameOriya(String nameOriya) {
		this.nameOriya = nameOriya;
	}
	public String getNameEnglish() {
		return nameEnglish;
	}
	public void setNameEnglish(String nameEnglish) {
		this.nameEnglish = nameEnglish;
	}
	public String getShortNameOriya() {
		return shortNameOriya;
	}
	public void setShortNameOriya(String shortNameOriya) {
		this.shortNameOriya = shortNameOriya;
	}
	public String getShortNameEnglish() {
		return shortNameEnglish;
	}
	public void setShortNameEnglish(String shortNameEnglish) {
		this.shortNameEnglish = shortNameEnglish;
	}
}
