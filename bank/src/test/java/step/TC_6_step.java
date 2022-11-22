package step;

import Manager.MasterManager;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage_DD;

public class TC_6_step {
	
	MasterManager mm;
	LoginPage_DD lp;
	
	public TC_6_step(MasterManager am) {
		mm=am;
		lp=mm.getPOM().getTheloginPageForDD();
	}
	
	@Then("Take The ScreenshotOfthe o\\/p")
	public void take_the_screenshot_ofthe_o_p() {
	    lp.TakeTheScreenShot();
	}

}
