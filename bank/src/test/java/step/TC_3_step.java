package step;

import CommonMethods.alertMethod;
import Manager.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.LoginPage_DD;

public class TC_3_step {
	
	MasterManager mm;	
	LoginPage_DD lp;
	alertMethod alt;
	public TC_3_step(MasterManager am) {
		mm=am;
		lp=mm.getPOM().getTheloginPageForDD();
		alt=mm.getPOM().GetAlert();
	}
	
	@Then("enter the username {string}")
	public void enter_the_username(String string) {
		lp.EnterTheUserNAme(string);
	}
	@Then("Enter the password {string}")
	public void enter_the_password(String string) {
		lp.EnterPassword(string);
	}
	@Then("verify the output")
	public void verify_the_output() {
		lp.VerifyTheWelcomeMsg();
		lp.verifyTheHeadermsg();
	}
	@Then("Verify the popup")
	public void verify_the_popup() {
		lp.switchToAlertPOPup();
		lp.VerifyThePOPupmsg();
		//alt.GetTheTextOfAlertThenAcceptIT();
		
	}

}
