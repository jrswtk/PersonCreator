/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.examples;

import com.person.creator.builder.PersonCreator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExampleCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonCreator creator = new PersonCreator();
        try {
            System.out.println(creator.createPerson());
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ExampleCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
