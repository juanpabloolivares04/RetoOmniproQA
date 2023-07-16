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

    @Step
    public void searchProduct(String product){
        objsearchBar.searchProduct(product);

    }

    @Step
        public void searchPrice()  {
        objsearchBar.searchLowerPrice();

    }
    @Step
    public void validationPrice()  {
        objsearchBar.catchLowPrice();

    }

}
