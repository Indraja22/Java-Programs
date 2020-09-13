package com.csg.cucumber.stepDefinition;

import com.csg.cucumber.Pages.CreateNewAccount;
import com.csg.cucumber.generics.LaunchDriver;
import com.csg.cucumber.generics.LaunchingURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class CreateNewAccount_StepDef {
    public WebDriver driver;
    LaunchDriver basic = new LaunchDriver(driver);
    LaunchingURL launchingURL = new LaunchingURL(driver);
    CreateNewAccount createNewAccount = new CreateNewAccount(driver);

    @Given("^User has launched Amazon$")
    public void user_has_launched_amazon() {
        launchingURL.launchUrl();
    }

    @Then("^User has to create a new account$")
    public void user_has_to_create_a_new_account() {
        createNewAccount.clickAccountsLink();
    }


}
