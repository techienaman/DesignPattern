package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {
    WebDriver driver;


    By searchElement= By.id("flightSearchContainer");

    public TravelHomePage(WebDriver driver){

        this.driver=driver;
    }

    InterfaceComponent searchAvail;


    By headerNavigationElement= By.xpath("//*[@class='search-buttons-heading']");
    By footerNaviagtionElement=By.id("traveller-home");

    public void gotoo(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }



    public HeaderNavigation goToHeaderNaviagtion(){
        return new HeaderNavigation(driver,headerNavigationElement);

    }


//    public void setBookingStrategy(InterfaceComponent searchAvail){
//        this.searchAvail=searchAvail;
//
//
//    }


    public void setBookingStrategy(String str){

        CreateStrategy createStrategy=new CreateStrategy(driver,searchElement);
        createStrategy.factoryMethod(str).avail();


    }

    public void checkAvailability(){
        searchAvail.avail();

    }


    public FooterNavigation goToFooterNaviagtion(){
        return new FooterNavigation(driver,footerNaviagtionElement);
    }

}
