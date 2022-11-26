package step;

import Manager.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.ChangePassword;

public class TC_7_step {
	MasterManager mm;
	ChangePassword cp;
	public TC_7_step(MasterManager am) {
		mm=am;
		cp=mm.getPOM().getTheChangepassword();
	}
	
	@Then("click on change password")
	public void click_on_change_password() {
	    cp.clickOnChangePassword();
	}

	@Then("enter the {string}")
	public void enter_the(String string) {
		cp.waitForAlert();
	    cp.enterOldpassword(string);
	}

	@Then("enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	    cp.enterNewPassword(string);
	    cp.enterCOnfirmPassword(string2);
	}

	@Then("Click on submit Button")
	public void click_on_submit_button() {
	    cp.clickOnsubmit();
	}

	@Then("Verify the popup {string}")
	public void verify_the_popup(String string) {
	   String act= cp.validateThePopup();
	   if(act.equalsIgnoreCase(string)) {
		   System.out.println("PopUp Matched");
	   }
	   else {
		   System.out.println(act+" is differed from "+ string);
	   }
	   cp.acceptThePoPup();
	}

}
