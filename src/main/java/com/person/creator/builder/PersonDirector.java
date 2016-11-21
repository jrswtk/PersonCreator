/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.builder;

import com.person.creator.domain.Person;


public class PersonDirector {
    
    private PersonBuilder personBuilder;

    public PersonDirector() {
    }

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }
    
    public void construtPerson() {
        personBuilder.buildPerson();
    }

    public PersonBuilder getPersonBuilder() {
        return personBuilder;
    }

    public void setPersonBuilder(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }
    
    public Person getPerson() {
        return personBuilder.getPerson();
    }
    
}
