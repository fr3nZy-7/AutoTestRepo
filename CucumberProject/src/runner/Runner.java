package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"stepDefinition"})  //Features is the folder containing the feature files
						//stepDefinition is the package that contain the steps to be executed

public class Runner {

}
