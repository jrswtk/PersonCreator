/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class Password {
    
    private final String password;
    private final String encodePassword;

    public Password(String password) {
        this.password = password;
        this.encodePassword = getEncodePassword();
    }

    public String getPassword() {
        return password;
    }

    public String getEncryptedPassword() {
        return encodePassword;
    }
           
    private String getEncodePassword() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    @Override
    public String toString() {
        return "[" + password + " " + encodePassword + "]";
    }
     
}
