/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.attributes;


public enum Age {
    
    CHILD(1, 12),
    TEEN(13, 17),
    ADULT(18, 64),
    PENSIONER(65, 100);
    
    int min;
    int max;

    private Age() {
    }
    
    private Age(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    public int getMin() {
        return min;
    }
    
    public int getMax() {
        return max;
    }
     
}
