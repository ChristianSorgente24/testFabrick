package com.test.fabrik.testFabrick.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class Account {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    Float saldo = 0f;
    Bonifico bonifico;
    List<Transazione> transazioni = new ArrayList<>();

    public Account() {
    }

    public Account(Long accountId, Float saldo, Bonifico bonifico, List<Transazione> tr) {
        this.id = accountId;
        this.saldo = saldo;
        this.bonifico = bonifico;
        this.transazioni = tr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Bonifico getBonifico() {
        return bonifico;
    }

    public void setBonifico(Bonifico bonifico) {
        this.bonifico = bonifico;
    }

    public List<Transazione> getTransazioni() {
        return transazioni;
    }

    public void setTransazioni(List<Transazione> transazioni) {
        this.transazioni = transazioni;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + id +
                ", saldo=" + saldo +
                ", bonifico=" + bonifico +

                '}';
    }


















}
