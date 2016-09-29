/**
 * 
 */
package com.astro.horoscope.domain;

/**
 * 
 * Astrologer's Information
 * 
 * @author sasanka
 *
 */
public class Astrologer {
	
	private String name;
	private String organization;
	private String awards;
	private Contacts contacts;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}
	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	/**
	 * @return the awards
	 */
	public String getAwards() {
		return awards;
	}
	/**
	 * @param awards the awards to set
	 */
	public void setAwards(String awards) {
		this.awards = awards;
	}
	/**
	 * @return the contacts
	 */
	public Contacts getContacts() {
		return contacts;
	}
	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	
}
