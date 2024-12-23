package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name="clientId", nullable = false)
    private Client clientId;

    private LocalDateTime creationDate;

    public Portfolio() {

    }
    public Portfolio(Client clientId, LocalDateTime creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }
    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClientId() {
        return clientId;
    }
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

}
