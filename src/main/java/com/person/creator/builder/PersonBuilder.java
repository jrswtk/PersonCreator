/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.builder;

import com.person.creator.domain.Person;
import com.person.creator.models.Address;
import com.person.creator.models.Password;
import com.person.creator.models.Pesel;
import com.person.creator.options.PersonOptions;
import com.person.creator.utils.FetchRandomData;
import com.person.creator.utils.FetchRandomDataUtil;
import com.person.creator.utils.PasswordUtil;
import com.person.creator.utils.PeselUtil;


public abstract class PersonBuilder {
    
    protected Person person;
    protected PersonOptions options;
    protected FetchRandomData fetch;

    public PersonBuilder() {
        this.person = new Person();
    }
    
    protected abstract void initBuilder();
    
    public void buildPerson() {
        buildFirstName();
        buildLastName();
        
        if(options.isAddress()) {
            buildAddress();
        }
        if(options.isEmail()) {
            buildEmail();
        }
        if(options.isPassword()) {
            buildPassword();
        }
        if(options.isPesel()) {
            buildPesel();
        }
    }
    
    private void buildFirstName() {
        String firstName = this.fetch.fetchFirstName();
        this.person.setFirstName(firstName);
    }

    private void buildLastName() {
        String lastName = this.fetch.fetchLastName();
        this.person.setLastName(lastName);
    }

    private void buildAddress() {
        Address address = this.fetch.fetchAddress();
        this.person.setAdress(address);
    }

    private void buildPesel() {
        Pesel pesel = new Pesel();
        PeselUtil peselUtil = new PeselUtil(options);                
        pesel.setPesel(peselUtil.generatePesel());
        pesel.setPeselData(peselUtil.getPeselData());
        this.person.setPesel(pesel);
    }

    private void buildPassword() {
        String generatePassword = PasswordUtil.generatePassword(10);
        Password password = new Password(generatePassword);
        this.person.setPassword(password);
    }
        
    protected void setPersonOptions(PersonOptions options) {
        this.options = options;
        this.fetch = new FetchRandomDataUtil(options);
    }
    
    private void buildEmail() {
        String email = this.fetch.fetchEmail();
        this.person.setEmail(email);
    }
    
    public Person getPerson() {
        return person;
    }
    
}
