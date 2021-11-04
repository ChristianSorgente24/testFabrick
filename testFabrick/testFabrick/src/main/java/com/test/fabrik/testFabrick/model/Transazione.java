package com.test.fabrik.testFabrick.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Transazione {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fromAccountingDate, toAccountingDate;

    public Transazione() {
    }

    public Transazione(Long custumerId, LocalDateTime fromAccountingDate, LocalDateTime toAccountingDate) {
        this.id = custumerId;
        this.fromAccountingDate = fromAccountingDate;
        this.toAccountingDate = toAccountingDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long custumerId) {
        this.id = custumerId;
    }

    public LocalDateTime getFromAccountingDate() {
        return fromAccountingDate;
    }

    public void setFromAccountingDate(LocalDateTime fromAccountingDate) {
        this.fromAccountingDate = fromAccountingDate;
    }

    public LocalDateTime getToAccountingDate() {
        return toAccountingDate;
    }

    public void setToAccountingDate(LocalDateTime toAccountingDate) {
        this.toAccountingDate = toAccountingDate;
    }

    @Override
    public String toString() {
        return "Transazione{" +
                "transazioneId=" + id +
                ", fromAccountingDate=" + fromAccountingDate +
                ", toAccountingDate=" + toAccountingDate +
                '}';
    }
}
