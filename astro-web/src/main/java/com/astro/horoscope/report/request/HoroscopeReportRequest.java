package com.astro.horoscope.report.request;

import com.astro.horoscope.report.request.God;
import com.astro.horoscope.report.request.Reference;

/**
 * Request object populated when user enters all horoscope details to prepare the report.
 * 
 * @author sasanka
 * @Date 24/09/2016
 *
 */
public class HoroscopeReportRequest {
	private God god;
	private Reference reference;
	private BirthDetails birthDetails;
	/**
	 * @return the god
	 */
	public God getGod() {
		return god;
	}
	/**
	 * @param god the god to set
	 */
	public void setGod(God god) {
		this.god = god;
	}
	/**
	 * @return the reference
	 */
	public Reference getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(Reference reference) {
		this.reference = reference;
	}
	/**
	 * @return the birthDetails
	 */
	public BirthDetails getBirthDetails() {
		return birthDetails;
	}
	/**
	 * @param birthDetails the birthDetails to set
	 */
	public void setBirthDetails(BirthDetails birthDetails) {
		this.birthDetails = birthDetails;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HoroscopeReportRequest [god=" + god + ", reference="
				+ reference + ", birthDetails=" + birthDetails + "]";
	}
	
}
