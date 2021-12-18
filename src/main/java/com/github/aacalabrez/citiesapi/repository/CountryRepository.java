package com.github.aacalabrez.citiesapi.repository;

import com.github.aacalabrez.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
