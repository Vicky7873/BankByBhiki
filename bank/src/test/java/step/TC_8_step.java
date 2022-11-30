package step;

import Manager.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.ChangePassword;

public class TC_8_step {
	
	MasterManager mm;
	ChangePassword cp;
	public TC_8_step(MasterManager am) {
		mm=am;
		cp=mm.getPOM().getTheChangepassword();
	}
	
	@Then("enter the Correct password")
	public void enter_the_correct_password() {
		cp.waitForAlert();
	    cp.enterTheCorrectPassoword();
	}
	
	@Then("user navigate to the Loginpage")
	public void user_navigate_to_the_loginpage() {
	    cp.GetTheTitleOfLoginPage();
	}

}
