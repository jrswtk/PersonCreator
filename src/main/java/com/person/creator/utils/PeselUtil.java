/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.utils;

import com.person.creator.models.PeselData;
import com.person.creator.options.PersonOptions;


public class PeselUtil extends PeselDataUtil {
    
    private String PESEL = "";

    public PeselUtil(PersonOptions options) {
        super(options);
    }

    @Override
    public String generatePesel() {
        PESEL += getFormatDay()
                + getFormatMonth()
                + getFormatYear()
                + getFormatSerial()
                + getFormatGender()
                + getFormatControlNumber();
        
        return PESEL;
    }

    public String getFormatDay() {
        int day = super.peselData.getDay();
        return formatValue(day);
    }

    public String getFormatMonth() {
        int year = super.peselData.getYear();
        int month = super.peselData.getMonth();
        
        if(year >= 1800 && year <= 1899) {
            month += 80;
        } else if(year >= 2000 && year <= 2099) {
            month += 20;
        } else if(year >= 2100 && year <= 2199) {
            month += 40;
        } else if(year >= 2200 && year <= 2299) {
            month += 60;
        }
        return formatValue(month);
    }

    public String getFormatYear() {       
        int year = super.peselData.getYear();
        return String.valueOf(year).substring(2, 4);
    }

    public String getFormatSerial() {
        int[] serial = super.peselData.getSerial();
        StringBuilder stringBuilder = new StringBuilder();
        for(int number : serial) {
            stringBuilder.append(String.valueOf(number));
        }
        return stringBuilder.toString();
    }

    public String getFormatGender() {
        int gender = super.peselData.getGender();
        return String.valueOf(gender);
    }

    public String getFormatControlNumber() {
        int number = super.peselData.getControlNumber();
        return String.valueOf(number);
    }
    
    private String formatValue(int value) {
        String formatValue = String.valueOf(value);
        if(formatValue.length() == 1) {
            formatValue = "0" + formatValue;
        }
        return formatValue;
    }
    
    public PeselData getPeselData() {
        return super.peselData;
    }

}
