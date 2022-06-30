package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {
    WebDriver driver;

    public TravelHomePage(WebDriver driver){

        this.driver=driver;
    }


    By headerNavigationElement= By.xpath("//*[@class='search-buttons-heading']");
    By footerNaviagtionElement=By.id("traveller-home");

    public void gotoo(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }



    public HeaderNavigation goToHeaderNaviagtion(){
        return new HeaderNavigation(driver,headerNavigationElement);

    }


    public FooterNavigation goToFooterNaviagtion(){
        return new FooterNavigation(driver,footerNaviagtionElement);
    }

}
