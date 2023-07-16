package org.omnipro.steps;

import net.thucydides.core.annotations.Step;
import org.omnipro.pages.changeLocationPage;
import org.omnipro.pages.searchBarPage;

public class changeLocationSteps {
    searchBarPage objsearchBar;
    changeLocationPage objLocation;

    @Step
    public void openNavigator(){
        objsearchBar.open();
        objsearchBar.maxScreen();
    }
    @Step
    public void chooseLocation(){
        objLocation.setLocation();
    }

}
