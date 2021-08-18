package com.github.felipeassoares.citiesapi.states.repository;

import com.github.felipeassoares.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
