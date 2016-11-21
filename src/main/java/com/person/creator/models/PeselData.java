/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.models;

import java.util.Arrays;


public class PeselData {
    
    private int day;
    private int month;
    private int year;
    private int[] serial;
    private int gender;
    private int controlNumber;

    public PeselData() {
    }

    public PeselData(int day, int month, int year, int[] serial, int gender, 
            int controlNumber) {
        
        this.day = day;
        this.month = month;
        this.year = year;
        this.serial = serial;
        this.gender = gender;
        this.controlNumber = controlNumber;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int[] getSerial() {
        return serial;
    }

    public void setSerial(int[] serial) {
        this.serial = serial;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }
    
    @Override
    public String toString() {
        return "[" 
                + day + "-" 
                + month + "-" 
                + year + "-" 
                + Arrays.toString(serial) + "-"
                + gender + "-" 
                + controlNumber 
                + "]";
    }   
    
    
}
