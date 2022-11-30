package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.alertMethod;
import utills.dataFromconfig;

public class LoginPage{
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	alertMethod alt=new alertMethod(driver);
	@FindBy(name="uid")
	WebElement input_UserNAme;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	WebElement input_password;
	
	@FindBy(xpath="//*[@name=\"btnLogin\"]")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(xpath="//marquee[@class=\"heading3\" or @behavior=\"alternate\"]")
	@CacheLookup
	WebElement getTxt_welcomeMsg;
	
	public void EnterTheUserNAme() {
		String name="mngr454831";
		input_UserNAme.sendKeys(name);
	}
	public void EnterPassword() {
		input_password.sendKeys("Bhiki@123");
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	String Msg;
	public void VerifyTheWelcomeMsg() {
		Msg=getTxt_welcomeMsg.getText();
		System.out.println(Msg); 
	}
	
	public void verifyTheHeadermsg() {
		String exp="Welcome To Manager's Page of Guru99 Bank";
		alt.ComapreTheExpectedAndActual(Msg, exp);
	}

}
