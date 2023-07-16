package org.omnipro.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class changeLocationPage extends PageObject {

    String btnLocation="//div[@class='nav-menu-item']";
    String liDepartment="//select[@id='stateDropdown']/option[1]";


    String liCity="//select[@id='citiesDropdown']";
    String deppa="//option[@primary='Meta']";

    public void setLocation() {
        find(By.xpath(btnLocation)).click();
        System.out.println("escogio");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

   /*     find(By.xpath(liDepartment)).click();*/
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click();", find(By.xpath(liDepartment)));

   /*     Select departamento = new Select(find(By.id("stateDropdown")));
        departamento.selectByVisibleText("Atlantico");*/

        System.out.println("escogio");
        find(By.xpath(deppa)).click();
        System.out.println("escogio");
        find(By.xpath(liCity)).click();


    }

}
