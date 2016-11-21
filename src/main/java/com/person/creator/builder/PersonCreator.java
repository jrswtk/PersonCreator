/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.builder;

import com.person.creator.attributes.PersonTypes;
import com.person.creator.domain.Person;
import com.person.creator.utils.RandomDataUtil;


public class PersonCreator extends RandomDataUtil {

    public Person createPerson() throws InstantiationException, IllegalAccessException {
        int randomPerson = super.getRandomValue(PersonTypes.values().length);
        
        PersonBuilder builder = (PersonBuilder) PersonTypes
                .values()[randomPerson]
                .getClazz()
                .newInstance();
        
        PersonDirector director = new PersonDirector(builder);
        director.construtPerson();
        return director.getPerson();
    }
    
}
