package com.pampspp.techchallengefiapfase1.services;

import com.pampspp.techchallengefiapfase1.dto.PortfolioDTO;
import com.pampspp.techchallengefiapfase1.entities.Portfolio;
import com.pampspp.techchallengefiapfase1.repositories.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository repository;

    public List<PortfolioDTO> findAll() {
        List<Portfolio> portfolios = repository.findAll();
        return portfolios.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public PortfolioDTO findById(Long id) {
        Portfolio portfolio = repository.findById(id).orElse(null);
        return convertToDTO(portfolio);
    }

    public PortfolioDTO addPortfolio(PortfolioDTO portfolioDTO) {
        Portfolio portfolio = convertToEntity(portfolioDTO);
        Portfolio savedPortfolio = repository.save(portfolio);
        return convertToDTO(savedPortfolio);
    }

    public PortfolioDTO updatePortfolio(PortfolioDTO portfolioDTO) {
        Portfolio portfolio = convertToEntity(portfolioDTO);
        Portfolio savedPortfolio = repository.save(portfolio);
        return convertToDTO(savedPortfolio);
    }

    private PortfolioDTO convertToDTO(Portfolio portfolio) {
        PortfolioDTO dto = new PortfolioDTO();
        dto.setPortfolio_id(portfolio.getPortfolio_id());
        dto.setBalance(portfolio.getBalance());
        dto.setEquitiesQuantityList(portfolio.getEquitiesQuantityList());
        return dto;
    }

    private Portfolio convertToEntity(PortfolioDTO portfolioDTO) {
        Portfolio entity = new Portfolio();
        entity.setPortfolio_id(portfolioDTO.getPortfolio_id());
        entity.setBalance(portfolioDTO.getBalance());
        entity.setEquitiesQuantityList(portfolioDTO.getEquitiesQuantityList());
        return entity;
    }

}





