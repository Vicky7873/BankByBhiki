package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPage;

public class PageObjectManager {
	
	private WebDriver driver;
	 public PageObjectManager(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 WebDriverManger webdriverManger;
	 LoginPage loginPage;
	 
	 public LoginPage getTheLoginPage() {
		 return (loginPage==null)? new LoginPage(driver):loginPage; 
	 }
	 
//	 public WebDriverManger getWebDriverManger() {
//		return(webdriverManger==null)?new WebDriverManger():webdriverManger;
//	}
	 
	

}
