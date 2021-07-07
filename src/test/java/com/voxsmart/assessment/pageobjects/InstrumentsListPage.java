package com.voxsmart.assessment.pageobjects;

import org.openqa.selenium.By;

public class InstrumentsListPage {

    public static By rowsOnPage(){
        return By.xpath("//tbody/tr");
    }
}
