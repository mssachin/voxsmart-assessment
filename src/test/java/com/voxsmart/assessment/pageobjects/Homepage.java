package com.voxsmart.assessment.pageobjects;

import org.openqa.selenium.By;

public class Homepage {

    public static By selectInstrumentType(String instrumentType){
        return By.xpath("//button[text()= '"+instrumentType+ "']");
    }
}
