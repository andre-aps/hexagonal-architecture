package com.example.hexagonal.application.core.domain;

public class Address {

    private String street;
    private String city;
    private String state;

    public Address(final String street, final String city, final String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

}
