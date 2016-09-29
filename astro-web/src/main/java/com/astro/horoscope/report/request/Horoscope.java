package com.astro.horoscope.report.request;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.astro.horoscope.domain.Antardasha;
import com.astro.horoscope.domain.Astrologer;
import com.astro.horoscope.domain.Dasha;
import com.astro.horoscope.domain.God;
import com.astro.horoscope.domain.HoroscopeDetails;
import com.astro.horoscope.domain.PlanetPosition;
import com.astro.horoscope.domain.Reference;
import com.astro.horoscope.domain.Shloka;

@XmlRootElement(name = "horoscope")
public class Horoscope {
	private God god;
	private Shloka shloka;
	private Astrologer astrologer;
	private Reference reference;
	private List<HoroscopeDetails> horoscopeDetailsList;
	private PlanetPosition planetPosition;
	private Dasha dasha;
	private Antardasha antardasha;
	
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
	 * @return the shloka
	 */
	public Shloka getShloka() {
		return shloka;
	}
	/**
	 * @param shloka the shloka to set
	 */
	public void setShloka(Shloka shloka) {
		this.shloka = shloka;
	}
	/**
	 * @return the astrologer
	 */
	public Astrologer getAstrologer() {
		return astrologer;
	}
	/**
	 * @param astrologer the astrologer to set
	 */
	public void setAstrologer(Astrologer astrologer) {
		this.astrologer = astrologer;
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
	 * @return the horoscopeDetailsList
	 */
	public List<HoroscopeDetails> getHoroscopeDetailsList() {
		return horoscopeDetailsList;
	}
	/**
	 * @param horoscopeDetailsList the horoscopeDetailsList to set
	 */
	public void setHoroscopeDetailsList(List<HoroscopeDetails> horoscopeDetailsList) {
		this.horoscopeDetailsList = horoscopeDetailsList;
	}
	/**
	 * @return the planetPosition
	 */
	public PlanetPosition getPlanetPosition() {
		return planetPosition;
	}
	/**
	 * @param planetPosition the planetPosition to set
	 */
	public void setPlanetPosition(PlanetPosition planetPosition) {
		this.planetPosition = planetPosition;
	}
	/**
	 * @return the dasha
	 */
	public Dasha getDasha() {
		return dasha;
	}
	/**
	 * @param dasha the dasha to set
	 */
	public void setDasha(Dasha dasha) {
		this.dasha = dasha;
	}
	/**
	 * @return the antardasha
	 */
	public Antardasha getAntardasha() {
		return antardasha;
	}
	/**
	 * @param antardasha the antardasha to set
	 */
	public void setAntardasha(Antardasha antardasha) {
		this.antardasha = antardasha;
	}
	
	
	
}
