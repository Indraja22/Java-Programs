package com.csg.cucumber.Pages;

import com.csg.cucumber.generics.LaunchDriver;
import com.csg.cucumber.pageObjects.NewAccountXpaths;
import org.openqa.selenium.WebDriver;

public class CreateNewAccount {

    public CreateNewAccount(WebDriver driver) {
        super(driver);
    }

    NewAccountXpaths newAccountXpaths;

    public void clickAccountsLink() {
        newAccountXpaths.accountLink.click();
    }
}
