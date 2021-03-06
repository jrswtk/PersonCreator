/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.builder;

import com.person.creator.attributes.Age;
import com.person.creator.attributes.Gender;
import com.person.creator.options.PersonOptions;


public final class BoyTeenPerson extends PersonBuilder {

    public BoyTeenPerson() {
        initBuilder();
    }

    @Override
    protected void initBuilder() {
        PersonOptions localOptions = new PersonOptions(
                true, true, true, true, Age.TEEN, Gender.MALE);
        setPersonOptions(localOptions);
    }
    
}
