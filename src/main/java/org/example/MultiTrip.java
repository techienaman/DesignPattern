package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiTrip extends  AbstractComponent implements  InterfaceComponent{

    public MultiTrip(WebDriver driver, By sectionElement) {
        super(driver,sectionElement);

    }

    @Override
    public void avail() {
        System.out.println("I am multi Trip");

    }
}
