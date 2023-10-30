package com.pampspp.techchallengefiapfase1.controllers;

import com.pampspp.techchallengefiapfase1.entities.Portfolio;
import com.pampspp.techchallengefiapfase1.repositories.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioRepository repository;

    @GetMapping
    public List<Portfolio> findAll() {
        List<Portfolio> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Portfolio findById(@PathVariable Long id) {
        Portfolio result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Portfolio addPortfolio(@RequestBody Portfolio portfolio) {
        Portfolio result = repository.save(portfolio);
        return result;
    }

}
