package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframeHandle {
	
	private WebDriver driver;
	public IframeHandle(WebDriver driver) {
		 this.driver=driver;
	 }
	
	public void switch_to_frame(String string) {
		driver.switchTo().frame(string);
	}
	
	public void switchtoframeByElementID(String string) {
		WebElement frame=driver.findElement(By.id(string));
		driver.switchTo().frame(frame);
	}	

}
