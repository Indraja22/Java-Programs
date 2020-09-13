package com.csg.flipkart_PageObjects;

import com.csg.flipkart_BaseClasses.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Flipkart_PageObject extends BaseTest {

    public Flipkart_PageObject(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
        @FindBy(xpath = "//a[contains(text(),'Login')]")
        public static WebElement login_FilpKart;

        @FindBy(xpath = "//a[contains(text(),'New to Flipkart? Create an account')]")
        public static WebElement create_new_account;

        @FindBy(xpath = "//form//input[@class = '_2zrpKA _1dBPDZ']")
        public static WebElement enter_mobile_number;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
        @Test
        public static void clickOnLogin() {

            System.out.println("I am here: At Login");
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_ESCAPE);
                robot.keyRelease(KeyEvent.VK_ESCAPE);
            }catch (AWTException e){
                e.printStackTrace();
            }
            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }

            login_FilpKart.click();
        }
        @Test
        public static void createNewAccount(){
            create_new_account.click();
        }
        @Test
        public static void enterMobileNumber(){
            enter_mobile_number.clear();
            enter_mobile_number.sendKeys("9112142974");
        }
}
