package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.sound.sampled.Port;
import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolioId;
    @Column(nullable = false)
    private String name;
    private String category;
    private LocalDateTime purchaseDate;
    private Double purchasePrice;
    private Double quantity;

    public Security() {

    }
    public Security(Portfolio portfolioId, String name, String category, LocalDateTime purchaseDate, Double purchasePrice, Double quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }
    public Long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }
    public void setPortfolioId(Portfolio portfolioId) {
        this.portfolioId = portfolioId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public Double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

}
