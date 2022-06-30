package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderNavigation extends AbstractComponent{

    By flights=By.xpath("//*[@title='Flights']");
    public HeaderNavigation(WebDriver driver, By sectionElement) {
        super(driver,sectionElement);

    }



    public void clickOnFlight(){
        System.out.println(customisedElement(flights).getAttribute("class"));

    }
}
