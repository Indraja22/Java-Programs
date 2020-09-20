package com.csg.cucumber.pageObjects;

import com.csg.cucumber.generics.LaunchDriver;
import com.csg.cucumber.generics.LaunchingURL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountXpaths extends LaunchingURL {
    public WebElement accountLink = driver.findElement(By.xpath("//*[contains(text(),'Account & Lists')]"));

    public NewAccountXpaths(WebDriver driver) {
        super(driver);
    }

}
