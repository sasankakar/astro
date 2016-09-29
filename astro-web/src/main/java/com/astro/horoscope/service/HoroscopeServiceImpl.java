package com.astro.horoscope.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.horoscope.data.entity.Shloka;
import com.astro.horoscope.data.repository.ShlokaRepository;
import com.astro.horoscope.domain.Horoscope;

@Service
public class HoroscopeServiceImpl implements HoroscopeService{
	
	@Autowired
	ShlokaRepository shlokaRepo;
	
	public List<Shloka> getAllShlokas(){
		return shlokaRepo.findAll();
	}
	public void prepareReport(Horoscope horoscope){
		
	}
}
