package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefination",
		monochrome = true,
		plugin = {"pretty", "html:target/HtmlReports"}
		
		)
public class TestRunner {

}
