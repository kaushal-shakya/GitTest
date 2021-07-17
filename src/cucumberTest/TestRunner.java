package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//@RunWith annotation tells JUnit that tests should run using 
//Cucumber class present in ‘Cucumber.api.junit‘ package.
@RunWith(Cucumber.class)

//annotation tells Cucumber a lot of things like where to look for feature files,
//what reporting system to use and some other things also.
@CucumberOptions(
		features="Feature",
		glue = {"stepDefinition"}
		)

public class TestRunner {
	
	
}
