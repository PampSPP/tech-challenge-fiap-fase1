package com.pampspp.techchallengefiapfase1.dto;

import com.pampspp.techchallengefiapfase1.entities.EquitiesQuantity;

import java.util.List;

public class PortfolioDTO {
    private Long portfolio_id;
    private Double balance;
    private List<EquitiesQuantity> equitiesQuantityList;

    public Long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(Long portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<EquitiesQuantity> getEquitiesQuantityList() {
        return equitiesQuantityList;
    }

    public void setEquitiesQuantityList(List<EquitiesQuantity> equitiesQuantityList) {
        this.equitiesQuantityList = equitiesQuantityList;
    }
}
