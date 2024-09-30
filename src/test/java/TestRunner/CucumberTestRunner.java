package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags=" ",features= {"src/test/resources/FeatureFiles/"},
glue= {"StepDefintion"},

monochrome = true, // Make console output readable
publish=true,

plugin = { 
    "html:target/cucumber.html", // HTML report
    "json:target/cucumber.json", // JSON report
    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", // Extent report
    "rerun:target/failed_scenarios.txt" // Rerun failed scenarios
}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	@Override
 @DataProvider(parallel = true) // Enable parallel execution
 public Object[][] scenarios() {
     return super.scenarios();
	 }
	
}
