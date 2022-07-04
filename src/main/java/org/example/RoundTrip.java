package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoundTrip extends AbstractComponent implements InterfaceComponent {
    WebDriver driver;


    public RoundTrip(WebDriver driver, By SectionElement){
        super(driver,SectionElement);
        this.driver=driver;

    }
    @Override
    public void avail() {
        System.out.println("I am RoundTrip");
    }
}
