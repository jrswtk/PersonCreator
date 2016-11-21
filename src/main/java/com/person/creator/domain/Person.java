/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.domain;

import com.person.creator.models.Address;
import com.person.creator.models.Password;
import com.person.creator.models.Pesel;


public class Person {
    
    private String firstName;
    private String lastName;
    private Address address;
    private Pesel pesel;
    private String email;
    private Password password;

    public Person() {
    }

    public Person(String firstName, String lastName, 
            Address address, Pesel pesel, String email, Password password) {
        
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pesel = pesel;
        this.email = email;
        this.password = password;
    }  

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }

    public Pesel getPesel() {
        return pesel;
    }

    public void setPesel(Pesel pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "[" 
                + firstName + " " 
                + lastName + " " 
                + address + " " 
                + pesel + " "
                + email + " " 
                + password 
                + "]";
    }   
    
}
