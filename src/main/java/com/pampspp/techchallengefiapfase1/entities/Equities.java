package com.pampspp.techchallengefiapfase1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "equities")
public class Equities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equities_id;
    private String ticker;
    private String name;
    private Double marketPrice;

    public Equities() {
    }

    public Long getEquities_id() {
        return equities_id;
    }

    public void setEquities_id(Long equities_id) {
        this.equities_id = equities_id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }
}
