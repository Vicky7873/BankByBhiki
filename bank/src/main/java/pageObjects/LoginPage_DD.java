package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.alertMethod;
import Manager.MasterManager;
import utills.dataFromconfig;

public class LoginPage_DD{
	private WebDriver driver;
	public LoginPage_DD(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement input_UserNAme;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	@CacheLookup
	WebElement input_password;
	
	@FindBy(xpath="//*[@name=\"btnLogin\"]")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(xpath="//marquee[@class=\"heading3\"]")
	@CacheLookup
	WebElement getTxt_welcomeMsg;
	
	public void EnterTheUserNAme(String string) {
		input_UserNAme.sendKeys(string);
	}
	public void EnterPassword(String string) {
		input_password.sendKeys(string);
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
	String act;
	alertMethod alt;
	public void switchToAlertPOPup() {
		alt=new alertMethod(driver);
		alt.switchToAlert();
		act=alt.GetTheTextOfAlertThenAcceptIT();
		System.out.println(act);
		alt.aceeptTheAlert();
	}
	
	public void VerifyThePOPupmsg() {
		String exp="User or Password is not valid";
		alt.ComapreTheExpectedAndActual(exp, act);
	}

}
