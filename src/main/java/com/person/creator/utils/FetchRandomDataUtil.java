/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.creator.utils;

import com.person.creator.attributes.Gender;
import com.person.creator.models.Address;
import com.person.creator.options.PersonOptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FetchRandomDataUtil extends RandomDataUtil implements FetchRandomData {
    
    private final PersonOptions personOptions;
    private JSONObject jsonObject;

    public FetchRandomDataUtil(PersonOptions personOptions) {
        this.personOptions = personOptions;
        initJsonObject();
    }

    @Override
    public String fetchFirstName() {
        JSONArray firstNames;
        if(personOptions.getGender() == Gender.MALE) {
            firstNames = getPersonModelsArray("mens", "firstName");
        } else {
            firstNames = getPersonModelsArray("womens", "firstName");
        }
        int randomName = super.getRandomValue(firstNames.size());
        return firstNames.get(randomName).toString();
    }

    @Override
    public String fetchLastName() {
        JSONArray lastNames;
        if(personOptions.getGender() == Gender.MALE) {
            lastNames = getPersonModelsArray("mens", "lastName");
        } else {
            lastNames = getPersonModelsArray("womens", "lastName");
        }
        int randomName = super.getRandomValue(lastNames.size());
        return lastNames.get(randomName).toString();
    }

    @Override
    public String fetchEmail() {
        JSONArray emails = getPersonModelsArray("emails", "email");
        int randomName = super.getRandomValue(emails.size());
        return emails.get(randomName).toString();
    }

    @Override
    public Address fetchAddress() {
        JSONArray addresses = (JSONArray) jsonObject.get("addresses");
        int randomName = super.getRandomValue(addresses.size());
        JSONObject addressObject = (JSONObject) addresses.get(randomName);
        return getAddress(addressObject);
    }
    
    private Address getAddress(JSONObject addressObject) {
        Address address = new Address();
        address.setState(addressObject.get("state").toString());
        address.setProvince(addressObject.get("province").toString());
        address.setCity(addressObject.get("city").toString());
        address.setStreet(addressObject.get("street").toString());
        address.setHouseNumber((Long) addressObject.get("houseNumber"));
        return address;
    }
    
    private JSONArray getPersonModelsArray(String gender, String model) {
        JSONObject modelObject = (JSONObject) jsonObject.get(gender);
        return (JSONArray) modelObject.get(model);
    }
    
    private void initJsonObject() {
        FileReader fileReader;
        JSONParser parser;
        
        Object object = null;
        
        try {
            
            fileReader = new FileReader(getDataFile());
            parser = new JSONParser();
            object = parser.parse(fileReader);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FetchRandomDataUtil.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(FetchRandomDataUtil.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
                
        this.jsonObject = (JSONObject) object;
    }
    
    private File getDataFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("data.json").getFile());
        return file;
    }
    
}
