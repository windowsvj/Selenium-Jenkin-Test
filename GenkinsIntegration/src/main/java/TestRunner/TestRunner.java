package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue={"StepDefinition"},
		plugin= {"html:target/cucumber-html-report",
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json",
				"junit:target/cucumber-results.xml"}
		)
public class TestRunner 
{
	
}
