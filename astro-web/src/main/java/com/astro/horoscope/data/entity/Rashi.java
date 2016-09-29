package com.astro.horoscope.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RASHI")
public class Rashi {
	
	@Id
	@Column(name="RASHI_POSITION")
	private int rashiPosition;
	@Column(name="RASHI_NAME_E")
	private String rashiNameEnglish;
	@Column(name="RASHI_NAME_SHORT_E")
	private String rashiNameShortEnglish;
	@Column(name="RASHI_NAME_O")
	private String rashiNameOriya;
	@Column(name="RASHI_NAME_SHORT_O")
	private String rashiNameShortOriya;
	
	
	public Rashi() {
		super();
	}
	public Rashi(int rashiPosition, String rashiNameEnglish,
			String rashiNameShortEnglish, String rashiNameOriya,
			String rashiNameShortOriya) {
		super();
		this.rashiPosition = rashiPosition;
		this.rashiNameEnglish = rashiNameEnglish;
		this.rashiNameShortEnglish = rashiNameShortEnglish;
		this.rashiNameOriya = rashiNameOriya;
		this.rashiNameShortOriya = rashiNameShortOriya;
	}
	public int getRashiPosition() {
		return rashiPosition;
	}
	public void setRashiPosition(int rashiPosition) {
		this.rashiPosition = rashiPosition;
	}
	public String getRashiNameEnglish() {
		return rashiNameEnglish;
	}
	public void setRashiNameEnglish(String rashiNameEnglish) {
		this.rashiNameEnglish = rashiNameEnglish;
	}
	public String getRashiNameShortEnglish() {
		return rashiNameShortEnglish;
	}
	public void setRashiNameShortEnglish(String rashiNameShortEnglish) {
		this.rashiNameShortEnglish = rashiNameShortEnglish;
	}
	public String getRashiNameOriya() {
		return rashiNameOriya;
	}
	public void setRashiNameOriya(String rashiNameOriya) {
		this.rashiNameOriya = rashiNameOriya;
	}
	public String getRashiNameShortOriya() {
		return rashiNameShortOriya;
	}
	public void setRashiNameShortOriya(String rashiNameShortOriya) {
		this.rashiNameShortOriya = rashiNameShortOriya;
	}
	@Override
	public String toString() {
		return "Rashi [rashiPosition=" + rashiPosition + ", rashiNameEnglish="
				+ rashiNameEnglish + ", rashiNameShortEnglish="
				+ rashiNameShortEnglish + ", rashiNameOriya=" + rashiNameOriya
				+ ", rashiNameShortOriya=" + rashiNameShortOriya + "]";
	}
}
