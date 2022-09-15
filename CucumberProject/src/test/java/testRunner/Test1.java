package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:/Personal Project/Projects/RestAssured/CucumberProject/FeatureFiles/Feature.feature"}, 
glue = "stepDefinision", 
dryRun = false, 
tags = {@smoke},
plugin = {"pretty", "html:test-output" }
)
public class Test1 {

}
