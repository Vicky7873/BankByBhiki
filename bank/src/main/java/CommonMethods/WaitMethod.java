package CommonMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethod {
	
	private WebDriver driver;
	
	public WaitMethod(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void waitForElementVisible(WebElement Element) {
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(Element));
	}

}
