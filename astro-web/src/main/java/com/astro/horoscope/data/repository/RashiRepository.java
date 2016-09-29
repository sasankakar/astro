package com.astro.horoscope.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astro.horoscope.data.entity.Rashi;

@Repository
public interface RashiRepository extends JpaRepository<Rashi, Integer>{

}
