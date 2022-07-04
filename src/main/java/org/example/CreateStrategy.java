package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateStrategy {

    WebDriver driver;
    By sectionElement;


    public CreateStrategy(WebDriver driver, By sectionElement){
        this.driver=driver;
        this.sectionElement=sectionElement;
    }




    public InterfaceComponent factoryMethod(String str){
        if(str.equalsIgnoreCase("roundTrip")){
            return new RoundTrip(driver,sectionElement);
        }
        if(str.equalsIgnoreCase("multiTrip")){
            return  new MultiTrip(driver,sectionElement);
        }
        return null;

    }
}
