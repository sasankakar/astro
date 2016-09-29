package com.astro.horoscope.domain;

import java.util.List;

public class RashiChakra {
	private String description;
	private List<RashiDetails> rashiDetails;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<RashiDetails> getRashiDetails() {
		return rashiDetails;
	}
	public void setRashiDetails(List<RashiDetails> rashiDetails) {
		this.rashiDetails = rashiDetails;
	}
}
