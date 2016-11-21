/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.models;


public class Address {
    
    private String state;
    private String province;
    private String city;
    private String street;
    private long houseNumber;

    public Address() {
    }

    public Address(String state, String province, String city, String street, 
            int houseNumber) {
        
        this.state = state;
        this.province = province;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(long houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "[" + state + " " + province + " " + city + " " + 
                street + " " + houseNumber + "]";
    }
    
}
