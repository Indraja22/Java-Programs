package com.csg.cucumber.generics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {

    WebDriver driver;
    public LaunchDriver(WebDriver driver){
        this.driver = driver;
        driver = new ChromeDriver();
    }


    public  WebDriver setupDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        } else {
            return driver;
        }
    }

}
