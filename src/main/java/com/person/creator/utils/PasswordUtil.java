/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.utils;

import java.util.Random;


public class PasswordUtil {
    
    public static String generatePassword(int length) {
        String password = "";
        
        for(int i = 0; i < length; i++) {
            int value = new Random().nextInt(126 - 33) + 33;
            password += Character.toString((char) value);
        }
        
        return password;
    }
    
}
