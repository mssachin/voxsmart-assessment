package com.voxsmart.assessment.tasks;

import com.voxsmart.assessment.utilities.WebInteraction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NavigatesTo {

    public void application(String environment){
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/"+environment+".properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebInteraction.navigateTo(properties.getProperty("url"));
    }
}
