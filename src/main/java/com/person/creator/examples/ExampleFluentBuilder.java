/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.examples;

import com.person.creator.attributes.Age;
import com.person.creator.attributes.Gender;
import com.person.creator.domain.Person;
import com.person.creator.fluent.PersonFluentBuilder;
import com.person.creator.models.Address;
import com.person.creator.models.Password;
import com.person.creator.models.Pesel;
import com.person.creator.options.PersonOptions;
import com.person.creator.utils.PasswordUtil;
import com.person.creator.utils.PeselUtil;


public class ExampleFluentBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = PersonFluentBuilder.init()
                .firstName("Jan")
                .lastName("Nowak")
                .email("nowak@email.com")
                .pesel(getPesel())
                .adress(getAddress())
                .password(getPassword())
                .build();
        
        System.out.println(person);
    }
    
    private static Password getPassword() {
        String passwordData = PasswordUtil.generatePassword(10);
        Password password = new Password(passwordData);
        return password;
    }
    
    private static Pesel getPesel() {
      PersonOptions options = new PersonOptions(
				true, true, true, true, Age.ADULT, Gender.MALE);
      PeselUtil peselUtil = new PeselUtil(options);  
      Pesel pesel = new Pesel();
      pesel.setPesel(peselUtil.generatePesel());
      pesel.setPeselData(peselUtil.getPeselData());
      return pesel;
    }
    
    private static Address getAddress() {
        Address address = new Address();
        address.setState("Poland");
        address.setProvince("lubelskie");
        address.setCity("Lublin");
        address.setStreet("Kocka");
        address.setHouseNumber(12);
        return address;
    }
    
}
