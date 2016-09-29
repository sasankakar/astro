package com.astro.horoscope.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astro.horoscope.data.entity.Shloka;

@Repository
public interface ShlokaRepository extends JpaRepository<Shloka, Integer>{

}
