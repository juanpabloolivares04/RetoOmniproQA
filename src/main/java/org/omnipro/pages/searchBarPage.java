package org.omnipro.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class searchBarPage extends PageObject {
    String txtSearchBar ="//input[@id='cb1-edit']";
    String btnSearchBar ="//button[@class='nav-search-btn']";
    String btnFilterOrder="//button[@id=':R5cab9:-trigger']";
    String liLowerPrice="//li[@id=':R5cab9:-menu-list-option-price_asc']";
    String lblProductLPrice="//div[@id=':ra:']";
   // String lblPrice="//div[@id='price']//span[@class='andes-visually-hidden']";

    @WhenPageOpens
    public void maxScreen(){
        getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        getDriver().manage().window().maximize();
    }

    public void searchProduct(String product){
        find(By.xpath(txtSearchBar)).sendKeys(product);
        find(By.xpath(btnSearchBar)).click();
    }

    public void searchLowerPrice() {
       find(By.xpath(btnFilterOrder)).click();
       find(By.xpath(liLowerPrice)).click();



    }

    public void catchLowPrice(){
        Assert.assertFalse("No encontro productos",find(By.xpath(liLowerPrice)).isVisible());

    }
}
