package RunnerTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(strict = true,features = {"src\\test\\resources"},glue = {"com.csg.flipkart_StepDefinition"},tags ={ ""},monochrome = true)
public class CucumberRnunnerTestNG extends AbstractTestNGCucumberTests {

}
