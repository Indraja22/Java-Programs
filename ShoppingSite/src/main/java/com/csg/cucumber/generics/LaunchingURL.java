package com.csg.cucumber.generics;
//driver = new ChromeDriver();
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchingURL extends LaunchDriver  {

    ConfigFileRead configFileRead = new ConfigFileRead();
   public WebDriver driver ;

    public LaunchingURL(WebDriver driver) {
        super(driver);

    }

    public void launchUrl() {
        driver.get(configFileRead.getApplicationUrl());
        System.out.println("The title of the webpage launched is : "+driver.getTitle());
    }
}
