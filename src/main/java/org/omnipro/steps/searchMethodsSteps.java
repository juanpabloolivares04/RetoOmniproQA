package org.omnipro.steps;

import net.thucydides.core.annotations.Step;
import org.omnipro.pages.searchBarPage;
import org.omnipro.pages.searchPaymentMethodsPage;

public class searchMethodsSteps {

    searchPaymentMethodsPage objPaymentMethodsPage;
    searchBarPage objsearchBar;


    @Step
    public void openNavigator(){
        objsearchBar.open();
        objsearchBar.maxScreen();
    }

    @Step
    public void searchMethod(){
        objPaymentMethodsPage.searchProduct();

    }
}
