package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {


    @Test
    public void demoTest1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        TravelHomePage travelHomePage=new TravelHomePage(driver);
travelHomePage.gotoo();
travelHomePage.goToFooterNaviagtion().clickOnFlight();
       // travelHomePage.goToHeaderNaviagtion().clickOnFlight();

    }
}
