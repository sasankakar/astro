package com.astro.horoscope.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GRAHA")
public class Graha {
	
	@Id
	@Column(name="GRAHA_ID")
	private int grahaId;
	@Column(name="GRAHA_NAME_E")
	private String grahaNameEnglish;
	@Column(name="GRAHA_NAME_SHORT_E")
	private String grahaNameShortEnglish;
	@Column(name="GRAHA_NAME_O")
	private String grahaNameOriya;
	@Column(name="GRAHA_NAME_SHORT_O")
	private String grahaNameShortOriya;
	
	
	public Graha() {
		super();
	}
	public Graha(int grahaId, String grahaNameEnglish,
			String grahaNameShortEnglish, String grahaNameOriya,
			String grahaNameShortOriya) {
		super();
		this.grahaId = grahaId;
		this.grahaNameEnglish = grahaNameEnglish;
		this.grahaNameShortEnglish = grahaNameShortEnglish;
		this.grahaNameOriya = grahaNameOriya;
		this.grahaNameShortOriya = grahaNameShortOriya;
	}
	public int getGrahaId() {
		return grahaId;
	}
	public void setGrahaId(int grahaId) {
		this.grahaId = grahaId;
	}
	public String getGrahaNameEnglish() {
		return grahaNameEnglish;
	}
	public void setGrahaNameEnglish(String grahaNameEnglish) {
		this.grahaNameEnglish = grahaNameEnglish;
	}
	public String getGrahaNameShortEnglish() {
		return grahaNameShortEnglish;
	}
	public void setGrahaNameShortEnglish(String grahaNameShortEnglish) {
		this.grahaNameShortEnglish = grahaNameShortEnglish;
	}
	public String getGrahaNameOriya() {
		return grahaNameOriya;
	}
	public void setGrahaNameOriya(String grahaNameOriya) {
		this.grahaNameOriya = grahaNameOriya;
	}
	public String getGrahaNameShortOriya() {
		return grahaNameShortOriya;
	}
	public void setGrahaNameShortOriya(String grahaNameShortOriya) {
		this.grahaNameShortOriya = grahaNameShortOriya;
	}
	@Override
	public String toString() {
		return "Graha [grahaId=" + grahaId + ", grahaNameEnglish="
				+ grahaNameEnglish + ", grahaNameShortEnglish="
				+ grahaNameShortEnglish + ", grahaNameOriya=" + grahaNameOriya
				+ ", grahaNameShortOriya=" + grahaNameShortOriya + "]";
	}
	
	
}
