package org.omnipro.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.junit.Before;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class searchBarPage extends PageObject {
    String txtSearchBar ="//input[@id='cb1-edit']";
    String btnSearchBar ="//button[@class='nav-search-btn']";
    String liLowerPrice="//li[@id=':R5cab9:-menu-list-option-price_asc']";

    @WhenPageOpens
    public void maxScreen(){
        getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        getDriver().manage().window().maximize();
    }

    public void searchProduct(String product){
        find(By.xpath(txtSearchBar)).sendKeys(product);
    }
}
