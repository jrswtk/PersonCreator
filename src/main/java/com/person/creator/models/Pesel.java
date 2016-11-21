/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.models;


public class Pesel {
    
    private PeselData peselData;
    private String pesel;

    public Pesel() {
    }

    public Pesel(PeselData peselData, String pesel) {
        this.peselData = peselData;
        this.pesel = pesel;
    }

    public PeselData getPeselData() {
        return peselData;
    }

    public void setPeselData(PeselData peselData) {
        this.peselData = peselData;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "[" + pesel + " " + peselData + "]";
    }
    
}
