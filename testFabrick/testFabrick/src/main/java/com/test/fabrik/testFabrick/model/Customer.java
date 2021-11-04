package com.test.fabrik.testFabrick.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    String name, surname;
    Account account;


    public Customer(Long id, String name, String surname, Account account) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.account = account;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Custumerid=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", account=" + account +
                '}';
    }
}
