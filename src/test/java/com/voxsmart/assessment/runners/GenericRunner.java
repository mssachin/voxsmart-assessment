package com.voxsmart.assessment.runners;

import com.voxsmart.assessment.utilities.InitDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/features"},
        glue = "com.voxsmart.assessment.stepdefinitions",
        tags = "@Navigation"
)
public class GenericRunner {

    @AfterClass
    public static void tearDown(){
        InitDriver.quitDriver();
    }
}
