package step;

import org.openqa.selenium.WebDriver;

import Manager.MasterManager;
import Manager.PageObjectManager;
import Manager.WebDriverManger;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;

public class TC_2_step extends WebDriverManger{
	MasterManager mm;	
	LoginPage lp;
	
	public TC_2_step(MasterManager am) {
		mm=am;
		lp=mm.getPOM().getTheLoginPage();
	}
	@Then("verify the header")
	public void verify_the_header() {
	    lp.VerifyTheWelcomeMsg();
	}
	
}
