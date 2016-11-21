/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.fluent;

import com.person.creator.domain.Person;
import com.person.creator.models.Address;
import com.person.creator.models.Password;
import com.person.creator.models.Pesel;


public class PersonFluentBuilder {
    
    private final Person person;

    public PersonFluentBuilder() {
        this.person = new com.person.creator.domain.Person();
    }
    
    public static PersonFluentBuilder init() {
        return new PersonFluentBuilder();
    }
        
    public PersonFluentBuilder firstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }
    
    public PersonFluentBuilder lastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }
    
    public PersonFluentBuilder adress(Address adress) {
        person.setAdress(adress);
        return this;
    }
    
    public PersonFluentBuilder pesel(Pesel pesel) {
        person.setPesel(pesel);
        return this;
    }
    
    public PersonFluentBuilder email(String email) {
        person.setEmail(email);
        return this;
    }
    
    public PersonFluentBuilder password(Password password) {
        person.setPassword(password);
        return this;
    }
    
    public Person build() {
        return person;
    }
    
}
