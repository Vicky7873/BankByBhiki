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
	@CacheLookup
	WebElement input_UserNAme;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	@CacheLookup
	WebElement input_password;
	
	@FindBy(xpath="//*[@name=\"btnLogin\"]")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(xpath="//marquee[@class=\"heading3\" or @behavior=\"alternate\"]")
	@CacheLookup
	WebElement getTxt_welcomeMsg;
	
	public void EnterTheUserNAme() {
		input_UserNAme.sendKeys(dataFromconfig.UserID);
	}
	public void EnterPassword() {
		input_password.sendKeys(dataFromconfig.Password);
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
