/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.examples;

import com.person.creator.builder.PersonBuilder;
import com.person.creator.builder.PersonDirector;
import com.person.creator.builder.WomanAdultPerson;


public class ExampleDirector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonDirector director = new PersonDirector();
        
        PersonBuilder builderWomen = new WomanAdultPerson();
        director.setPersonBuilder(builderWomen);
        
        director.construtPerson();
        
        System.out.println(director.getPerson());
    }
    
}
