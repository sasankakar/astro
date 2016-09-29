package com.astro.horoscope.domain;

/**
 * Main template for birth chart
 * 
 * The result pdf page will have multiple sections like - 
 * god's image, om text, chant, about astrologer, main header horizontal bar, name & adddress, janma kundali
 * 
 * This class encapsulates all sections in the result page
 * 
 * @author sasanka
 * @Date 15/11/2015
 *
 */
public class Horoscope {
	
	// general attributes at profile level
	private String serialNo;
	private String preparedDate;
	
	private ProfileHeader profileHeader;
	private BirthDetails birthDetails;
	private RashiChakra rashiChakra;
	private NabanshaChakra nabanshaChakra;
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(String preparedDate) {
		this.preparedDate = preparedDate;
	}
	public ProfileHeader getProfileHeader() {
		return profileHeader;
	}
	public void setProfileHeader(ProfileHeader profileHeader) {
		this.profileHeader = profileHeader;
	}
	public BirthDetails getBirthDetails() {
		return birthDetails;
	}
	public void setBirthDetails(BirthDetails birthDetails) {
		this.birthDetails = birthDetails;
	}
	public RashiChakra getRashiChakra() {
		return rashiChakra;
	}
	public void setRashiChakra(RashiChakra rashiChakra) {
		this.rashiChakra = rashiChakra;
	}
	public NabanshaChakra getNabanshaChakra() {
		return nabanshaChakra;
	}
	public void setNabanshaChakra(NabanshaChakra nabanshaChakra) {
		this.nabanshaChakra = nabanshaChakra;
	}
}
