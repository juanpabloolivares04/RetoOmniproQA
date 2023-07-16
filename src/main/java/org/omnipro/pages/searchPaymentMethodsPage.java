package org.omnipro.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class searchPaymentMethodsPage extends PageObject {

    String btnMethods = "//a[contains(text(),'Ver todos')]/parent::div[@class='payment-data-subtitle']";
    public void searchProduct() {
        find(By.xpath(btnMethods)).click();
    }
}
