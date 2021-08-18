package com.github.felipeassoares.citiesapi.countries.repositories;

import com.github.felipeassoares.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
