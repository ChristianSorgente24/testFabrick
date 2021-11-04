package com.test.fabrik.testFabrick.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Bonifico {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String receiverName, amount, description, currency, executionDate;

    public Bonifico() {
    }

    public Bonifico(Long custumerId, String receiverName, String amount, String description, String currency, String executionDate) {
        this.id = custumerId;
        this.receiverName = receiverName;
        this.amount = amount;
        this.description = description;
        this.currency = currency;
        this.executionDate = executionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    @Override
    public String toString() {
        return "Bonifico{" +
                "bonificoId=" + id +
                ", receiverName='" + receiverName + '\'' +
                ", amount='" + amount + '\'' +
                ", description='" + description + '\'' +
                ", currency='" + currency + '\'' +
                ", executionDate='" + executionDate + '\'' +
                '}';
    }
}
