package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/main/java/Feature",	
glue={"Stepdefenition"})

public class Testrunner extends AbstractTestNGCucumberTests {
	

}
