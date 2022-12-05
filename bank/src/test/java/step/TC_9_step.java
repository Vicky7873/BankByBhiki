package step;

import java.io.IOException;

import Manager.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.ChangePassword;
import pageObjects.New_Customer;
import utills.randomUtils;

public class TC_9_step {
	
	MasterManager mm;
	New_Customer NC;
	ChangePassword cp;
	public TC_9_step(MasterManager am) {
		mm=am;
		NC=mm.getPOM().getTheNew_Customer();
		cp=mm.getPOM().getTheChangepassword();
	}
	randomUtils rr=new randomUtils();
	
	@Then("click on Add customer {string},{string},{string},{string},{string},{string},{string},{string}")
	public void click_on_add_customer(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    NC.clickOnAddCustomer();
	    cp.waitForAlert();
	    NC.EnterTheCustomerName(string);
	    NC.ClickOnRadioButtonMAle();
	    NC.ClickOnDOB();
	    NC.clickOnAddress(string2);
	    NC.clickOnCity(string3);
	    NC.clickOnState(string4);
	    NC.clickOnPIN(string5);
	    NC.clickOnInputTelephone(string6);
	    NC.clickOnEmailId(rr.setTheEmailForTC_9_step());
	    NC.clickOnPassword(string8);
	}

	@Then("Add the required fields")
	public void add_the_required_fields() throws IOException {
	    NC.TakeTheSSofDetails();
	}

	@Then("click on Submit")
	public void click_on_submit() {
	    NC.clickOnSubmit();
	}

}
