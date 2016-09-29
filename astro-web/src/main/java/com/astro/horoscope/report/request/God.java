/**
 * 
 */
package com.astro.horoscope.report.request;

/**
 * 
 * This God object is part of HoroscopeReportRequest object. The relationship is composition type.
 * 
 * This object holds ids of each items in GOD's category in horoscope details request form.
 * 
 * @author sasanka
 * @Date 24/09/2016
 *
 */
public class God {
	private int welcomeId;
	private int imageId;
	private int shlokaId;
	/**
	 * @return the welcomeId
	 */
	public int getWelcomeId() {
		return welcomeId;
	}
	/**
	 * @param welcomeId the welcomeId to set
	 */
	public void setWelcomeId(int welcomeId) {
		this.welcomeId = welcomeId;
	}
	/**
	 * @return the imageId
	 */
	public int getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	/**
	 * @return the shlokaId
	 */
	public int getShlokaId() {
		return shlokaId;
	}
	/**
	 * @param shlokaId the shlokaId to set
	 */
	public void setShlokaId(int shlokaId) {
		this.shlokaId = shlokaId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "God [welcomeId=" + welcomeId + ", imageId=" + imageId
				+ ", shlokaId=" + shlokaId + "]";
	}
	
	
}
