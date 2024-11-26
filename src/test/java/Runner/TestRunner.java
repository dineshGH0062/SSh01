package Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="./Features",
                glue ="./Stepdefinitions")



public class TestRunner extends AbstractTestNGCucumberTests{

}
