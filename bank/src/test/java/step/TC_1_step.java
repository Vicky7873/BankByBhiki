package step;

import org.openqa.selenium.WebDriver;

import Manager.MasterManager;
import Manager.PageObjectManager;
import Manager.WebDriverManger;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class TC_1_step {
	
	MasterManager mm;	
	LoginPage lp;
	
	public TC_1_step(MasterManager am) {
		mm=am;
		lp=mm.getPOM().getTheLoginPage();
	}
	
	@Given("open the url")
	public void open_the_url() {
	    WebDriverManger.setTheURl();
	}

	@Then("enter the username")
	public void enter_the_username() {
	    lp.EnterTheUserNAme();
	}

	@Then("Enter the password")
	public void enter_the_password() {
	   lp.EnterPassword();
	}

	@Then("click on loginButton")
	public void click_on_login_button() {
	    lp.clickLogin();
	}

}
