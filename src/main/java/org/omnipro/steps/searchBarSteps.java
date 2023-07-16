package org.omnipro.steps;

import net.thucydides.core.annotations.Step;
import org.omnipro.pages.searchBarPage;

public class searchBarSteps {

    searchBarPage objsearchBar;

    @Step
    public void openNavigator(){
        objsearchBar.open();
        objsearchBar.maxScreen();
    }
}
