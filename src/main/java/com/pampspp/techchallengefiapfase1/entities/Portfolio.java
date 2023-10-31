package com.pampspp.techchallengefiapfase1.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolio_id;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "portfolio")
    @JsonManagedReference
    private List<EquitiesQuantity> equitiesQuantityList = new ArrayList<>();
    private Double balance;

    public Portfolio() {
    }

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

    public Double addCash(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public Double removeCash(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public List<EquitiesQuantity> getEquitiesQuantityList() {
        return equitiesQuantityList;
    }

    public void setEquitiesQuantityList(List<EquitiesQuantity> equitiesQuantityList) {
        this.equitiesQuantityList = equitiesQuantityList;
    }
}
