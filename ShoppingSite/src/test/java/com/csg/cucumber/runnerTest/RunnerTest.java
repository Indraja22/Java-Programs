package com.csg.cucumber.runnerTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/cucumber",
        glue = "com.csg.cucumber.stepDefinition",
        tags = "@New_Customer_Login",
        monochrome = true
)

public class RunnerTest extends AbstractTestNGCucumberTests {




}
