package com.csg.flipkart_StepDefinition;


import com.csg.flipkart_BaseClasses.BaseTest;
import com.csg.flipkart_PageObjects.Flipkart_PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDef extends BaseTest {
            //BaseTest baseTest = new BaseTest();

           // WebDriver driver;
            Flipkart_PageObject  flipkartUI;
            //WebDriver driver;




    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("User has launched the application")
    public void user_has_launched_the_application() {
        BaseTest.LaunchBrowser();
        BaseTest.Launch_url("launch.url");


    }

    @When("User is able to create a new account for himself or is able to login to an existing account")
    public void user_is_able_to_create_a_new_account_for_himself_or_is_able_to_login_to_an_existing_account() {
        flipkartUI  = new Flipkart_PageObject(driver);
        flipkartUI.clickOnLogin();
        flipkartUI.createNewAccount();
        flipkartUI.enterMobileNumber();

    }



    @Then("Take a screenshot of successfull login")
    public void take_a_screenshot_of_successfull_login() {
        System.out.println("Lets Take a Screenshot");
    }



}
