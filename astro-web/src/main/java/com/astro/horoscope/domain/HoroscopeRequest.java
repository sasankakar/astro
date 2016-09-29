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
 * @Date 25/08/2016
 *
 */
public class HoroscopeRequest {
	
	private Field god;
	private Field reference;
	private Field preparedDate;
	private Field name;
	private Field fatherName;
	private Field motherName;
	private Field gotra;
	private Field garbha;
	private Field dob;
	
	//private FieldGroup birthTime;
	private Field birthTime;
	private Field ampm;
	
	private FieldGroup masaTithiBara;
	private Field masa;
	private Field tithi;
	private Field bara;	
	private Field dayNight;
	
	private Field swambachara;
	private Field hora;
	
	private FieldGroup drokan;
	private Field drokanRashi;
	private Field drokanGraha;
	
	private FieldGroup nabansa;
	private Field nabansaRashi;
	private Field nabansaGraha;
	
	private FieldGroup dwadansasa;
	private Field dwadansasaRashi;
	private Field dwadansasaGraha;
	
	private Field trishansa;
	private Field barna;
	private Field gana;
	private Field nadi;
	private Field swara;
	
	private FieldGroup barga;
	private Field bargaRashi;
	private Field bargaGraha;
	/**
	 * @return the god
	 */
	public Field getGod() {
		return god;
	}
	/**
	 * @param god the god to set
	 */
	public void setGod(Field god) {
		this.god = god;
	}
	/**
	 * @return the reference
	 */
	public Field getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(Field reference) {
		this.reference = reference;
	}
	/**
	 * @return the preparedDate
	 */
	public Field getPreparedDate() {
		return preparedDate;
	}
	/**
	 * @param preparedDate the preparedDate to set
	 */
	public void setPreparedDate(Field preparedDate) {
		this.preparedDate = preparedDate;
	}
	/**
	 * @return the name
	 */
	public Field getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(Field name) {
		this.name = name;
	}
	/**
	 * @return the fatherName
	 */
	public Field getFatherName() {
		return fatherName;
	}
	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(Field fatherName) {
		this.fatherName = fatherName;
	}
	/**
	 * @return the motherName
	 */
	public Field getMotherName() {
		return motherName;
	}
	/**
	 * @param motherName the motherName to set
	 */
	public void setMotherName(Field motherName) {
		this.motherName = motherName;
	}
	/**
	 * @return the gotra
	 */
	public Field getGotra() {
		return gotra;
	}
	/**
	 * @param gotra the gotra to set
	 */
	public void setGotra(Field gotra) {
		this.gotra = gotra;
	}
	/**
	 * @return the garbha
	 */
	public Field getGarbha() {
		return garbha;
	}
	/**
	 * @param garbha the garbha to set
	 */
	public void setGarbha(Field garbha) {
		this.garbha = garbha;
	}
	/**
	 * @return the dob
	 */
	public Field getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Field dob) {
		this.dob = dob;
	}
	/**
	 * @return the birthTime
	 */
	public Field getBirthTime() {
		return birthTime;
	}
	/**
	 * @param birthTime the birthTime to set
	 */
	public void setBirthTime(Field birthTime) {
		this.birthTime = birthTime;
	}
	
	/**
	 * @return the ampm
	 */
	public Field getAmpm() {
		return ampm;
	}
	/**
	 * @param ampm the ampm to set
	 */
	public void setAmpm(Field ampm) {
		this.ampm = ampm;
	}
	/**
	 * @return the masaTithiBara
	 */
	public FieldGroup getMasaTithiBara() {
		return masaTithiBara;
	}
	/**
	 * @param masaTithiBara the masaTithiBara to set
	 */
	public void setMasaTithiBara(FieldGroup masaTithiBara) {
		this.masaTithiBara = masaTithiBara;
	}
	/**
	 * @return the masa
	 */
	public Field getMasa() {
		return masa;
	}
	/**
	 * @param masa the masa to set
	 */
	public void setMasa(Field masa) {
		this.masa = masa;
	}
	/**
	 * @return the tithi
	 */
	public Field getTithi() {
		return tithi;
	}
	/**
	 * @param tithi the tithi to set
	 */
	public void setTithi(Field tithi) {
		this.tithi = tithi;
	}
	/**
	 * @return the bara
	 */
	public Field getBara() {
		return bara;
	}
	/**
	 * @param bara the bara to set
	 */
	public void setBara(Field bara) {
		this.bara = bara;
	}
	/**
	 * @return the dayNight
	 */
	public Field getDayNight() {
		return dayNight;
	}
	/**
	 * @param dayNight the dayNight to set
	 */
	public void setDayNight(Field dayNight) {
		this.dayNight = dayNight;
	}
	/**
	 * @return the swambachara
	 */
	public Field getSwambachara() {
		return swambachara;
	}
	/**
	 * @param swambachara the swambachara to set
	 */
	public void setSwambachara(Field swambachara) {
		this.swambachara = swambachara;
	}
	/**
	 * @return the hora
	 */
	public Field getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(Field hora) {
		this.hora = hora;
	}
	/**
	 * @return the drokan
	 */
	public FieldGroup getDrokan() {
		return drokan;
	}
	/**
	 * @param drokan the drokan to set
	 */
	public void setDrokan(FieldGroup drokan) {
		this.drokan = drokan;
	}
	/**
	 * @return the drokanRashi
	 */
	public Field getDrokanRashi() {
		return drokanRashi;
	}
	/**
	 * @param drokanRashi the drokanRashi to set
	 */
	public void setDrokanRashi(Field drokanRashi) {
		this.drokanRashi = drokanRashi;
	}
	/**
	 * @return the drokanGraha
	 */
	public Field getDrokanGraha() {
		return drokanGraha;
	}
	/**
	 * @param drokanGraha the drokanGraha to set
	 */
	public void setDrokanGraha(Field drokanGraha) {
		this.drokanGraha = drokanGraha;
	}
	/**
	 * @return the nabansa
	 */
	public FieldGroup getNabansa() {
		return nabansa;
	}
	/**
	 * @param nabansa the nabansa to set
	 */
	public void setNabansa(FieldGroup nabansa) {
		this.nabansa = nabansa;
	}
	/**
	 * @return the nabansaRashi
	 */
	public Field getNabansaRashi() {
		return nabansaRashi;
	}
	/**
	 * @param nabansaRashi the nabansaRashi to set
	 */
	public void setNabansaRashi(Field nabansaRashi) {
		this.nabansaRashi = nabansaRashi;
	}
	/**
	 * @return the nabansaGraha
	 */
	public Field getNabansaGraha() {
		return nabansaGraha;
	}
	/**
	 * @param nabansaGraha the nabansaGraha to set
	 */
	public void setNabansaGraha(Field nabansaGraha) {
		this.nabansaGraha = nabansaGraha;
	}
	/**
	 * @return the dwadansasa
	 */
	public FieldGroup getDwadansasa() {
		return dwadansasa;
	}
	/**
	 * @param dwadansasa the dwadansasa to set
	 */
	public void setDwadansasa(FieldGroup dwadansasa) {
		this.dwadansasa = dwadansasa;
	}
	/**
	 * @return the dwadansasaRashi
	 */
	public Field getDwadansasaRashi() {
		return dwadansasaRashi;
	}
	/**
	 * @param dwadansasaRashi the dwadansasaRashi to set
	 */
	public void setDwadansasaRashi(Field dwadansasaRashi) {
		this.dwadansasaRashi = dwadansasaRashi;
	}
	/**
	 * @return the dwadansasaGraha
	 */
	public Field getDwadansasaGraha() {
		return dwadansasaGraha;
	}
	/**
	 * @param dwadansasaGraha the dwadansasaGraha to set
	 */
	public void setDwadansasaGraha(Field dwadansasaGraha) {
		this.dwadansasaGraha = dwadansasaGraha;
	}
	/**
	 * @return the trishansa
	 */
	public Field getTrishansa() {
		return trishansa;
	}
	/**
	 * @param trishansa the trishansa to set
	 */
	public void setTrishansa(Field trishansa) {
		this.trishansa = trishansa;
	}
	/**
	 * @return the barna
	 */
	public Field getBarna() {
		return barna;
	}
	/**
	 * @param barna the barna to set
	 */
	public void setBarna(Field barna) {
		this.barna = barna;
	}
	/**
	 * @return the gana
	 */
	public Field getGana() {
		return gana;
	}
	/**
	 * @param gana the gana to set
	 */
	public void setGana(Field gana) {
		this.gana = gana;
	}
	/**
	 * @return the nadi
	 */
	public Field getNadi() {
		return nadi;
	}
	/**
	 * @param nadi the nadi to set
	 */
	public void setNadi(Field nadi) {
		this.nadi = nadi;
	}
	/**
	 * @return the swara
	 */
	public Field getSwara() {
		return swara;
	}
	/**
	 * @param swara the swara to set
	 */
	public void setSwara(Field swara) {
		this.swara = swara;
	}
	/**
	 * @return the barga
	 */
	public FieldGroup getBarga() {
		return barga;
	}
	/**
	 * @param barga the barga to set
	 */
	public void setBarga(FieldGroup barga) {
		this.barga = barga;
	}
	/**
	 * @return the bargaRashi
	 */
	public Field getBargaRashi() {
		return bargaRashi;
	}
	/**
	 * @param bargaRashi the bargaRashi to set
	 */
	public void setBargaRashi(Field bargaRashi) {
		this.bargaRashi = bargaRashi;
	}
	/**
	 * @return the bargaGraha
	 */
	public Field getBargaGraha() {
		return bargaGraha;
	}
	/**
	 * @param bargaGraha the bargaGraha to set
	 */
	public void setBargaGraha(Field bargaGraha) {
		this.bargaGraha = bargaGraha;
	}
}
