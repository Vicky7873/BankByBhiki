package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Functional_TC/BankTC_2.feature",
		glue="step",
		dryRun = false
		)

public class TestRunner {

}
