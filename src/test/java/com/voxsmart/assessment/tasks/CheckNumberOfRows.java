package com.voxsmart.assessment.tasks;

import com.voxsmart.assessment.pageobjects.InstrumentsListPage;
import com.voxsmart.assessment.utilities.WebInteraction;

public class CheckNumberOfRows {

    public int onTheListPage(){
        WebInteraction.jsScrollToElement(InstrumentsListPage.rowsOnPage());
        return WebInteraction.getNumberOfElements(InstrumentsListPage.rowsOnPage()).size();
    }
}
