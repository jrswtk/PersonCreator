/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.options;

import com.person.creator.attributes.Age;
import com.person.creator.attributes.Gender;


public class PersonOptions {
    
    private boolean address;
    private boolean password;
    private boolean email;
    private boolean pesel;
    private Age age;
    private Gender gender;
    
    public PersonOptions() {
        this.address = false;
        this.password = false;
        this.email = false;
        this.pesel = false;
        this.age = Age.ADULT;
        this.gender = Gender.MALE;
    }
    
    public PersonOptions(boolean address, boolean password, boolean email, 
            boolean pesel) {
        
        this.address = address;
        this.password = password;
        this.email = email;
        this.pesel = pesel;
    }

    public PersonOptions(boolean address, boolean password, boolean email, 
            boolean pesel, Age age, Gender gender) {
        
        this.address = address;
        this.password = password;
        this.email = email;
        this.pesel = pesel;
        this.age = age;
        this.gender = gender;
    }

    public boolean isAddress() {
        return address;
    }

    public void setAddress(boolean address) {
        this.address = address;
    }

    public boolean isPassword() {
        return password;
    }

    public void setPassword(boolean password) {
        this.password = password;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public boolean isPesel() {
        return pesel;
    }

    public void setPesel(boolean pesel) {
        this.pesel = pesel;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    
    
}
