package com.pampspp.techchallengefiapfase1.controllers;

import com.pampspp.techchallengefiapfase1.entities.Equities;
import com.pampspp.techchallengefiapfase1.entities.Portfolio;
import com.pampspp.techchallengefiapfase1.repositories.EquitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/equities")
public class EquitiesController {

    @Autowired
    private EquitiesRepository repository;

    @GetMapping
    public List<Equities> findAll() {
        List<Equities> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Equities findById(@PathVariable Long id) {
        Equities result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Equities addPortfolio(@RequestBody Equities equities) {
        Equities result = repository.save(equities);
        return result;
    }

}
