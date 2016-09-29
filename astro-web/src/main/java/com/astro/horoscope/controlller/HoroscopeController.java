package com.astro.horoscope.controlller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.astro.horoscope.domain.GrahaDetails;
import com.astro.horoscope.domain.Horoscope;
import com.astro.horoscope.domain.RashiChakra;
import com.astro.horoscope.domain.RashiDetails;

@Controller
@RequestMapping(value="/astro1")
public class HoroscopeController {
	
	@ModelAttribute
	public Horoscope prepareHoroscopeProfile(){
		Horoscope horoscope = new Horoscope();
		
		// setting general data
		horoscope.setSerialNo("1215/114/08");
		horoscope.setPreparedDate("22-11-2015");
		
		// preparing rashi-chakra
		RashiChakra rashiChakra = new RashiChakra();
		rashiChakra.setDescription("Rashi Chakra of Sasanka");
		rashiChakra.setRashiDetails(getRashiList());
		
		// setting rashi-chakra
		horoscope.setRashiChakra(rashiChakra);
		
		return horoscope;
	}
	
	@RequestMapping(value="/horoscopeForm")
	public String hello(){
		return "horoscope/astroProfile";
	}
	
	private List<RashiDetails> getRashiList(){
		List<RashiDetails> rashiList = new ArrayList<>();
		List<GrahaDetails> grahaList = getGrahaList();
		
		//Mesha
		RashiDetails meshaRashi = new RashiDetails();
		meshaRashi.setPosition(1);
		meshaRashi.setNameOriya("Mesha");
		meshaRashi.setShortNameOriya("ME");
		meshaRashi.setNameEnglish("");
		meshaRashi.setShortNameEnglish("");
		meshaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(meshaRashi);
		
		//Brusha
		RashiDetails brushaRashi = new RashiDetails();
		brushaRashi.setPosition(2);
		brushaRashi.setNameOriya("Brusha");
		brushaRashi.setShortNameOriya("BR");
		brushaRashi.setNameEnglish("");
		brushaRashi.setShortNameEnglish("");
		brushaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(brushaRashi);
		
		//Mithun
		RashiDetails mithunRashi = new RashiDetails();
		mithunRashi.setPosition(3);
		mithunRashi.setNameOriya("Mithun");
		mithunRashi.setShortNameOriya("MI");
		mithunRashi.setNameEnglish("");
		mithunRashi.setShortNameEnglish("");
		mithunRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(mithunRashi);
		
		//Karkata
		RashiDetails karkataRashi = new RashiDetails();
		karkataRashi.setPosition(4);
		karkataRashi.setNameOriya("Karkata");
		karkataRashi.setShortNameOriya("KA");
		karkataRashi.setNameEnglish("");
		karkataRashi.setShortNameEnglish("");
		karkataRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(karkataRashi);
		
		//Singha
		RashiDetails singhaRashi = new RashiDetails();
		singhaRashi.setPosition(5);
		singhaRashi.setNameOriya("Singha");
		singhaRashi.setShortNameOriya("SI");
		singhaRashi.setNameEnglish("");
		singhaRashi.setShortNameEnglish("");
		singhaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(singhaRashi);
		
		//Kanya
		RashiDetails kanyaRashi = new RashiDetails();
		kanyaRashi.setPosition(6);
		kanyaRashi.setNameOriya("Kanya");
		kanyaRashi.setShortNameOriya("KA");
		kanyaRashi.setNameEnglish("");
		kanyaRashi.setShortNameEnglish("");
		kanyaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(kanyaRashi);
		
		//Tula
		RashiDetails tulaRashi = new RashiDetails();
		tulaRashi.setPosition(7);
		tulaRashi.setNameOriya("Tula");
		tulaRashi.setShortNameOriya("TU");
		tulaRashi.setNameEnglish("");
		tulaRashi.setShortNameEnglish("");
		tulaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(tulaRashi);
		
		//Bichha
		RashiDetails bichhaRashi = new RashiDetails();
		bichhaRashi.setPosition(8);
		bichhaRashi.setNameOriya("Bichha");
		bichhaRashi.setShortNameOriya("BI");
		bichhaRashi.setNameEnglish("");
		bichhaRashi.setShortNameEnglish("");
		bichhaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(bichhaRashi);
		
		//Makara
		RashiDetails makaraRashi = new RashiDetails();
		makaraRashi.setPosition(9);
		makaraRashi.setNameOriya("Makara");
		makaraRashi.setShortNameOriya("MA");
		makaraRashi.setNameEnglish("");
		makaraRashi.setShortNameEnglish("");
		makaraRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(makaraRashi);
		
		//Dhanu
		RashiDetails dhanuRashi = new RashiDetails();
		dhanuRashi.setPosition(10);
		dhanuRashi.setNameOriya("Dhanu");
		dhanuRashi.setShortNameOriya("DH");
		dhanuRashi.setNameEnglish("");
		dhanuRashi.setShortNameEnglish("");
		dhanuRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(dhanuRashi);
		
		//Kumbha
		RashiDetails kumbhaRashi = new RashiDetails();
		kumbhaRashi.setPosition(11);
		kumbhaRashi.setNameOriya("Kumbha");
		kumbhaRashi.setShortNameOriya("KU");
		kumbhaRashi.setNameEnglish("");
		kumbhaRashi.setShortNameEnglish("");
		kumbhaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(kumbhaRashi);
		
		//Mina
		RashiDetails minaRashi = new RashiDetails();
		minaRashi.setPosition(12);
		minaRashi.setNameOriya("Mina");
		minaRashi.setShortNameOriya("MI");
		minaRashi.setNameEnglish("");
		minaRashi.setShortNameEnglish("");
		minaRashi.setGrahasInThisRashi(grahaList);
		rashiList.add(minaRashi);
		
		return rashiList;
	}
	
	private List<GrahaDetails> getGrahaList(){
		List<GrahaDetails> grahaList = new ArrayList<>();
		
		// creating all grahas
		//Budha
		GrahaDetails budhaGraha = new GrahaDetails();
		budhaGraha.setId(1);
		budhaGraha.setNameOriya("Budha");
		budhaGraha.setShortNameOriya("BU");
		budhaGraha.setNameEnglish("");
		budhaGraha.setShortNameEnglish("");
		grahaList.add(budhaGraha);
		
		//Sukra
		GrahaDetails sukraGraha = new GrahaDetails();
		sukraGraha.setId(2);
		sukraGraha.setNameOriya("Sukra");
		sukraGraha.setShortNameOriya("SU");
		sukraGraha.setNameEnglish("");
		sukraGraha.setShortNameEnglish("");
		grahaList.add(sukraGraha);
		
		//Mangala
		GrahaDetails mangalaGraha = new GrahaDetails();
		mangalaGraha.setId(3);
		mangalaGraha.setNameOriya("Mangala");
		mangalaGraha.setShortNameOriya("MA");
		mangalaGraha.setNameEnglish("");
		mangalaGraha.setShortNameEnglish("");
		grahaList.add(mangalaGraha);
		
		//Bruhaspati
		GrahaDetails bruhaspatiGraha = new GrahaDetails();
		bruhaspatiGraha.setId(4);
		bruhaspatiGraha.setNameOriya("Bruhaspati");
		bruhaspatiGraha.setShortNameOriya("BR");
		bruhaspatiGraha.setNameEnglish("");
		bruhaspatiGraha.setShortNameEnglish("");
		grahaList.add(bruhaspatiGraha);
		
		//Sani
		GrahaDetails saniGraha = new GrahaDetails();
		saniGraha.setId(5);
		saniGraha.setNameOriya("Sani");
		saniGraha.setShortNameOriya("SA");
		saniGraha.setNameEnglish("");
		saniGraha.setShortNameEnglish("");
		grahaList.add(saniGraha);
		
		//Ravi
		GrahaDetails raviGraha = new GrahaDetails();
		raviGraha.setId(6);
		raviGraha.setNameOriya("Ravi");
		raviGraha.setShortNameOriya("RA");
		raviGraha.setNameEnglish("");
		raviGraha.setShortNameEnglish("");
		grahaList.add(raviGraha);
		
		//Chandra
		GrahaDetails chandraGraha = new GrahaDetails();
		chandraGraha.setId(7);
		chandraGraha.setNameOriya("Chandra");
		chandraGraha.setShortNameOriya("CH");
		chandraGraha.setNameEnglish("");
		chandraGraha.setShortNameEnglish("");
		grahaList.add(chandraGraha);
		
		//Rahu
		GrahaDetails rahuGraha = new GrahaDetails();
		rahuGraha.setId(8);
		rahuGraha.setNameOriya("Rahu");
		rahuGraha.setShortNameOriya("RA");
		rahuGraha.setNameEnglish("");
		rahuGraha.setShortNameEnglish("");
		grahaList.add(rahuGraha);
		
		//Ketu
		GrahaDetails ketuGraha = new GrahaDetails();
		ketuGraha.setId(9);
		ketuGraha.setNameOriya("Ketu");
		ketuGraha.setShortNameOriya("KE");
		ketuGraha.setNameEnglish("");
		ketuGraha.setShortNameEnglish("");
		grahaList.add(ketuGraha);
		
		return grahaList;
		
	}
	
}
