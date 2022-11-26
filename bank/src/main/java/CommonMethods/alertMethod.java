package CommonMethods;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertMethod {
	Alert alt;
	WebDriverWait wait;
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
	
	public void dismissThepopup() {
		alt.dismiss();
	}
	
	public void ComapreTheExpectedAndActual(String exp, String Actual) {
		if(Actual.equalsIgnoreCase(exp)) {
			System.out.println("Actual Text is "+Actual);
		}
		else {
			System.out.println("The "+exp+" is not equals to "+Actual);
		}
	}
	
	public WebDriverWait WaitForWebDriverWait(int a) {
		return wait=new WebDriverWait(driver, Duration.ofSeconds(a));
		
	}
	
}
