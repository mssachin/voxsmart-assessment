package com.voxsmart.assessment.stepdefinitions;

import com.voxsmart.assessment.tasks.CheckNumberOfRows;
import com.voxsmart.assessment.tasks.NavigatesTo;
import com.voxsmart.assessment.tasks.SelectsInstrumentType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationStepDefinitions {

    private final NavigatesTo navigatesTo = new NavigatesTo();
    private final SelectsInstrumentType selectsInstrumentType = new SelectsInstrumentType();
    private final CheckNumberOfRows checkNumberOfRows = new CheckNumberOfRows();

    @Given("I navigate to the {string} app")
    public void iNavigateToTheApp(String environment) {
        navigatesTo.application(environment);
    }

    @When("I browse {string}")
    public void iBrowse(String instrumentType) {
        selectsInstrumentType.onTheHomepage(instrumentType);
    }

    @Then("I can see {string} results on the page")
    public void iCanSeeResultsOnThePage(String numberOfInstruments) {
        int numberOfRowsOnPage = checkNumberOfRows.onTheListPage();
        Assert.assertEquals(Integer.parseInt(numberOfInstruments), numberOfRowsOnPage);
    }
}
