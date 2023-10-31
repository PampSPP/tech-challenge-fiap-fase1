package com.pampspp.techchallengefiapfase1.controllers;

import com.pampspp.techchallengefiapfase1.dto.PortfolioDTO;
import com.pampspp.techchallengefiapfase1.entities.Portfolio;
import com.pampspp.techchallengefiapfase1.repositories.PortfolioRepository;
import com.pampspp.techchallengefiapfase1.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService service;

    @GetMapping
    public List<PortfolioDTO> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public PortfolioDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public PortfolioDTO addPortfolio(@RequestBody PortfolioDTO portfolioDTO) {
        return service.addPortfolio(portfolioDTO);
    }

    @PutMapping
    public PortfolioDTO updatePortfolio(@RequestBody PortfolioDTO portfolioDTO) {
        return service.updatePortfolio(portfolioDTO);
    }

}
