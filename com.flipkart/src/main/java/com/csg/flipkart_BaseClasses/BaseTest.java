package com.csg.flipkart_BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class BaseTest {

    //initialise the WebDriver
    public static WebDriver driver;


    @BeforeSuite
    public static void LaunchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public static void Launch_url(String keyToFind){
        String dir = System.getProperty("user.dir");
        String fileName = "//flipkart.properties";
        String filePath = dir + fileName;
        File file = new File(filePath);
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try{
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Enumeration KeyValues = prop.keys();
        while (KeyValues.hasMoreElements()){
            String key = (String) KeyValues.nextElement();
            String values = prop.getProperty(key);
            System.out.println(key+" = "+values);
            keyToFind = values;
            System.out.println(keyToFind);
        }
        driver.get(keyToFind);

    }

    @AfterSuite
    public void closeOpenBrowser(){
        driver.quit();
    }
}
