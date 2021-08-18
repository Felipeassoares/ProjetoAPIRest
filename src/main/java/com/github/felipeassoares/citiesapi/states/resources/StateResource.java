package com.github.felipeassoares.citiesapi.states.resources;

import com.github.felipeassoares.citiesapi.states.entities.State;

import java.util.List;

import com.github.felipeassoares.citiesapi.states.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {

        this.repository = repository;
    }

    @GetMapping
    public List<State> states(){
        return repository.findAll();
    }
}

