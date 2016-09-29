/**
 * 
 */
package com.astro.horoscope.report.request;

/**
 * Horoscope report reference details
 * 
 * @author sasanka
 *
 */
public class Reference {
	private String serialNoFieldLabel;
	private String serialNo;
	private String preparedDateFieldLabel;
	private String preparedDate;
	
	/**
	 * @return the serialNoFieldLabel
	 */
	public String getSerialNoFieldLabel() {
		return serialNoFieldLabel;
	}
	/**
	 * @param serialNoFieldLabel the serialNoFieldLabel to set
	 */
	public void setSerialNoFieldLabel(String serialNoFieldLabel) {
		this.serialNoFieldLabel = serialNoFieldLabel;
	}
	/**
	 * @return the serialNo
	 */
	public String getSerialNo() {
		return serialNo;
	}
	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	/**
	 * @return the preparedDateFieldLabel
	 */
	public String getPreparedDateFieldLabel() {
		return preparedDateFieldLabel;
	}
	/**
	 * @param preparedDateFieldLabel the preparedDateFieldLabel to set
	 */
	public void setPreparedDateFieldLabel(String preparedDateFieldLabel) {
		this.preparedDateFieldLabel = preparedDateFieldLabel;
	}
	/**
	 * @return the preparedDate
	 */
	public String getPreparedDate() {
		return preparedDate;
	}
	/**
	 * @param preparedDate the preparedDate to set
	 */
	public void setPreparedDate(String preparedDate) {
		this.preparedDate = preparedDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Reference [serialNoFieldLabel=" + serialNoFieldLabel
				+ ", serialNo=" + serialNo + ", preparedDateFieldLabel="
				+ preparedDateFieldLabel + ", preparedDate=" + preparedDate
				+ "]";
	}
	
	
}
