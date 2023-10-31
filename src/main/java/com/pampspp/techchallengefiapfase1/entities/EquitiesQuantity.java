package com.pampspp.techchallengefiapfase1.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.pampspp.techchallengefiapfase1.controllers.EquitiesQuantitiesController;
import jakarta.persistence.*;

@Entity
@Table(name = "equities_quantity")
public class EquitiesQuantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equitiesQuantityId;
    @ManyToOne
    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolio_id")
    @JsonBackReference
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "equities_id", referencedColumnName = "equities_id")
    private Equities equity;

    private int quantity;

    public EquitiesQuantity() {
    }

    public Long getEquitiesQuantityId() {
        return equitiesQuantityId;
    }

    public void setEquitiesQuantityId(Long equitiesQuantityId) {
        this.equitiesQuantityId = equitiesQuantityId;
    }

    public Equities getEquity() {
        return equity;
    }

    public void setEquity(Equities equity) {
        this.equity = equity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long equitiesQuantityId() {
        return equitiesQuantityId;
    }

    public void equitiesQuantityId(Long equitiesQuantityId) {
        this.equitiesQuantityId = equitiesQuantityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
