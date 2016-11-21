/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.utils;

import java.util.Random;


public abstract class RandomDataUtil {
    
    protected int getRandomValue(int range) {
        return new Random().nextInt(range);
    }
    
}
