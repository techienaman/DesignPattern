package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNavigation extends AbstractComponent {
    By flight=By.cssSelector("[title='Flights']");


    public FooterNavigation(WebDriver driver, By sectionElement){
        super(driver,sectionElement);

    }


    public void clickOnFlight(){
        System.out.println(customisedElement(flight).getAttribute("class"));

    }
}
