package com.example.hexagonal.application.core.domain;

public class Customer {

    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;

    public Customer(final String id, final String name, final Address address, final String cpf, final Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    public Customer() {
        this.isValidCpf = false;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public Boolean getIsValidCpf() {
        return isValidCpf;
    }

    public void setIsValidCpf(final Boolean validCpf) {
        isValidCpf = validCpf;
    }

}
