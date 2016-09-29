package com.astro.horoscope.domain;

import java.util.List;

public class RashiDetails {
	private int position;
	private String nameOriya;
	private String nameEnglish;
	private String shortNameOriya;
	private String shortNameEnglish;
	
	private List<GrahaDetails> grahasInThisRashi;
	private String grahas;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
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

	public List<GrahaDetails> getGrahasInThisRashi() {
		return grahasInThisRashi;
	}

	public void setGrahasInThisRashi(List<GrahaDetails> grahasInThisRashi) {
		this.grahasInThisRashi = grahasInThisRashi;
	}

	public String getGrahas() {
		return grahas;
	}

	public void setGrahas(String grahas) {
		this.grahas = grahas;
	}
}
