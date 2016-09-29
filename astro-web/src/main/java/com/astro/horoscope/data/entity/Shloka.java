package com.astro.horoscope.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SHLOKA")
public class Shloka {
	@Id
	@GeneratedValue
	@Column(name="SHLOKA_ID")
	private int shlokaId;
	@Column(name="SHLOKA_E")
	private String shlokaEnglish;
	@Column(name="SHLOKA_SHORT_E")
	private String shlokaShortEnglish;
	@Column(name="SHLOKA_O")
	private String shlokaOriya;
	
	public int getShlokaId() {
		return shlokaId;
	}
	public void setShlokaId(int shlokaId) {
		this.shlokaId = shlokaId;
	}
	public String getShlokaEnglish() {
		return shlokaEnglish;
	}
	public void setShlokaEnglish(String shlokaEnglish) {
		this.shlokaEnglish = shlokaEnglish;
	}
	public String getShlokaShortEnglish() {
		return shlokaShortEnglish;
	}
	public void setShlokaShortEnglish(String shlokaShortEnglish) {
		this.shlokaShortEnglish = shlokaShortEnglish;
	}
	public String getShlokaOriya() {
		return shlokaOriya;
	}
	public void setShlokaOriya(String shlokaOriya) {
		this.shlokaOriya = shlokaOriya;
	}
}