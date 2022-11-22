package CommonMethods;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import Manager.MasterManager;
import Manager.WebDriverManger;

public class alertMethod {
	Alert alt;
	private WebDriver driver;
	public alertMethod(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchToAlert() {
		alt = driver.switchTo().alert();
	}
	
	public String GetTheTextOfAlertThenAcceptIT() {
		return alt.getText();
	}
	
	public void aceeptTheAlert() {
		alt.accept();
	}
	
	public void ComapreTheExpectedAndActual(String exp, String Actual) {
		if(Actual.equalsIgnoreCase(exp)) {
			System.out.println("Actual Text is "+Actual);
		}
		else {
			System.out.println("The "+exp+" is not equals to "+Actual);
		}
	}

}
