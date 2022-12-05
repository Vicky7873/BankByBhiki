package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// for parallel execution
@CucumberOptions(
		//features = {".//Functional_TC/BankTC_1.feature",".//Functional_TC/BankTC_2.feature"},
		features = {".//Functional_TC/BankTC_10.feature"},
		glue="step",
		plugin = {"pretty", "html:target/cucumber.html" },
		dryRun = false
		)

public class TestRunner {

}
