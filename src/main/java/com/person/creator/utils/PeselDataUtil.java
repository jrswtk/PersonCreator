/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.utils;

import com.person.creator.attributes.Gender;
import com.person.creator.models.PeselData;
import com.person.creator.options.PersonOptions;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public abstract class PeselDataUtil {

    private final PersonOptions options;
    
    protected final PeselData peselData;
    private final Random generator;
    
    public PeselDataUtil(PersonOptions options) {
        this.options = options;
        this.peselData = new PeselData();
        this.generator = new Random();
        setPeselData();
    }
    
    public abstract String generatePesel();
    
    private void setPeselData() {
        PeselDate peselDate = getDate();
        
        peselData.setDay(peselDate.day);
        peselData.setMonth(peselDate.month);
        peselData.setYear(peselDate.year);
        peselData.setSerial(getSerial());
        peselData.setGender(getGenderValue());
        peselData.setControlNumber(getControlNumber());
    }

    private int getControlNumber() {
       return getRandomValue();
    }
    
    private int getGenderValue() {
        int min = 0;
        int max = 9;
        
        if (options.getGender() == Gender.MALE) {
            int value = getRandomValue();
            if (value % 2 == 0) {
                value += 1;
            }
            return value;
        } else {
            return generator.nextInt((max - min) / 2) * 2;
        }
    }
    
    private int[] getSerial() {
       int[] serial = new int[3];
       
       for (int i = 0; i < serial.length; i++) {
           serial[i] = getRandomValue();
       }
       
       return serial;
    }
    
    private PeselDate getDate() {
       PeselDate peselDate = PeselDate.getInstance();
       
       peselDate.year = getYear();
       peselDate.month = getMonth();
       peselDate.day = getDay(peselDate.year, peselDate.month);
              
       return peselDate;
    }
    
    private int getDay(int year, int month) {
       YearMonth daysInMonth = YearMonth.of(year, month);
               
       int oneDay = 1;
       int days = daysInMonth.lengthOfMonth();
              
       return generator.nextInt((days - oneDay) + 1) + oneDay;
    }
    
    private int getMonth() {
        int early = 1;
        int late = 12;
        return generator.nextInt(late - early) + early;
    }
    
    private int getYear() {
        return getRandomYearOfBirth();
    }
    
    private int getRandomYearOfBirth() {
        int yearsOld = getRandomValue(options.getAge().getMin(), 
                options.getAge().getMax());
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        int yearCurrent =  calendar.get(Calendar.YEAR);
        return yearCurrent - yearsOld;
    }
    
    private int getRandomValue(int min, int max) {
        return generator.nextInt(max - min) + min;
    }
    
    private int getRandomValue() {
        int min = 0;
        int max = 9;
        return generator.nextInt(max - min) + min;
    }
    
    private static class PeselDate {
        
        int day;
        int month;        
        int year;
        
        static PeselDate getInstance() {
            return new PeselDate();
        }
        
    }
       
}
