package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// for parallel execution
@CucumberOptions(
		//features = {".//Functional_TC/BankTC_1.feature",".//Functional_TC/BankTC_2.feature"},
		features = ".//Functional_TC/BankTC_3B.feature",
		glue="step",
		dryRun = false
		)

public class TestRunner {

}
