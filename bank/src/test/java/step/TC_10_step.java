package step;

import Manager.MasterManager;
import Manager.PageObjectManager;
import io.cucumber.java.en.Then;
import pageObjects.New_Customer;
import utills.randomUtils;

public class TC_10_step {
	MasterManager mm;
	New_Customer NC;
	public TC_10_step(MasterManager am) {
		mm=am;
		NC=mm.getPOM().getTheNew_Customer();
	}
	randomUtils rr=new randomUtils();
	@Then("click on continue button")
	public void click_on_continue_button() {
	    rr.Customer_id=NC.GetTheTextOfCuxtomerID();
	    System.out.println(rr.Customer_id);
	    NC.clickOnContinueButton();
	}

}
