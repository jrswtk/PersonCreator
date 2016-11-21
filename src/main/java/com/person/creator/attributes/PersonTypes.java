/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.attributes;

import com.person.creator.builder.BoyTeenPerson;
import com.person.creator.builder.GirlChildPerson;
import com.person.creator.builder.MenPensionerPerson;
import com.person.creator.builder.WomanAdultPerson;


public enum PersonTypes {
    
    WOMEN_ADULT_PERSON(WomanAdultPerson.class),
    MEN_PENSIONER_PERSON(MenPensionerPerson.class),
    GIRL_CHILD_PERSON(GirlChildPerson.class),
    BOY_TEEN_PERSON(BoyTeenPerson.class);
    
    Class clazz;

    private PersonTypes() {
    }
    
    private PersonTypes(Class clazz) {
        this.clazz = clazz;
    }
    
    public Class getClazz() {
        return clazz;
    }
}
