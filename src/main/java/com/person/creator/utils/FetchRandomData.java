/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.utils;

import com.person.creator.models.Address;


public interface FetchRandomData {
    
    public String fetchFirstName();
    public String fetchLastName();
    public String fetchEmail();
    public Address fetchAddress();
    
}
