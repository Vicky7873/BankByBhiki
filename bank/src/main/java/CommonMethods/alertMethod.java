package CommonMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class alertMethod {
	
	private WebDriver driver;
	Alert alt;
	
	public alertMethod(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void switchToAlert() {
		alt=driver.switchTo().alert();
	}
	
	public String GetTheTextOfAlertThenAcceptIT() {
		String text=alt.getText();
		return text;
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
