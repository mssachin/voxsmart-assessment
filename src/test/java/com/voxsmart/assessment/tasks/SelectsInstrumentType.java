package com.voxsmart.assessment.tasks;

import com.voxsmart.assessment.pageobjects.Homepage;
import com.voxsmart.assessment.utilities.WebInteraction;

public class SelectsInstrumentType {

    public void onTheHomepage(String instrumentType) {
        WebInteraction.clickElement(Homepage.selectInstrumentType(instrumentType));
    }
}
