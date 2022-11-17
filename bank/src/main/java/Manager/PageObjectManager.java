package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.alertMethod;
import pageObjects.LoginPage;
import pageObjects.LoginPage_DD;

public class PageObjectManager {
	
	private WebDriver driver;
	 public PageObjectManager(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 WebDriverManger webdriverManger;
	 LoginPage loginPage;
	 LoginPage_DD Login_datadriven;
	 alertMethod alert;
	 
	 public LoginPage getTheLoginPage() {
		 return (loginPage==null)? new LoginPage(driver):loginPage; 
	 }
	 
	 public LoginPage_DD getTheloginPageForDD() {
		 return (Login_datadriven==null)? new LoginPage_DD(driver):Login_datadriven;
	 }
	 
	 public alertMethod GetAlert() {
		 return (alert==null)?new alertMethod(driver):alert;
	 }
}
