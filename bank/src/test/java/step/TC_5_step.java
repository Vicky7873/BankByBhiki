package step;

import org.openqa.selenium.WebDriver;

import Manager.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage_DD;

public class TC_5_step {
	MasterManager mm;
	LoginPage_DD lp;
	
	public TC_5_step(MasterManager am) {
		mm=am;
		lp=mm.getPOM().getTheloginPageForDD();
	}
	
	@Then("verify the MangersID")
	public void verify_the_mangers_id() {
	    lp.getTheMangersID(); 
	}

}
