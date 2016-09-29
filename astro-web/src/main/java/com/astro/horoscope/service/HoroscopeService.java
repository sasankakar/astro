package com.astro.horoscope.service;

import java.util.List;

import com.astro.horoscope.data.entity.Shloka;
import com.astro.horoscope.domain.Horoscope;

public interface HoroscopeService {
	public List<Shloka> getAllShlokas();
	public void prepareReport(Horoscope horoscope);
}
