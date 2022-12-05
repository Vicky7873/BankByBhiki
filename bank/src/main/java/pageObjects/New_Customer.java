package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.ScreenShotMethods;

public class New_Customer {
	
	private WebDriver driver;
	ScreenShotMethods ss;
	public New_Customer(WebDriver driver) {
		PageFactory.initElements(driver,this);
		ss=new ScreenShotMethods(driver);
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement btn_AddCustomer;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	@CacheLookup
	WebElement input_CustomerName;
	
	@FindBy(xpath="//input[@value=\"m\"]")
	@CacheLookup
	WebElement rdoBtn_Male;
	
	@FindBy(xpath="//input[@id=\"dob\"]")
	@CacheLookup
	WebElement input_dob;
	
	@FindBy(xpath="//textarea[@name=\"addr\"]")
	@CacheLookup
	WebElement input_addr;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement input_city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement input_state;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement input_pin;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement input_telephone;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement input_emailid;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement input_password;
	
	@FindBy(xpath="//input[@name=\"sub\"]")
	@CacheLookup
	WebElement btn_submit;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	@CacheLookup
	WebElement btn_continue;
	
	@FindBy(xpath="//table[@name=\"customer\"]//tr[4]//td[2]")
	@CacheLookup
	WebElement getTxt_ofCustomerId;
	
	public void clickOnAddCustomer() {
		btn_AddCustomer.click();
	}
	
	public void EnterTheCustomerName(String string) {
		input_CustomerName.sendKeys(string);
	}
	
	public void ClickOnRadioButtonMAle() {
		rdoBtn_Male.click();
	}
	
	public void ClickOnDOB() {
		input_dob.sendKeys("03/27/1995");
	}
	
	public void clickOnAddress(String string) {
		input_addr.sendKeys(string);
	}
	
	public void clickOnCity(String string) {
		input_city.sendKeys(string);
	}
	
	public void clickOnState(String string) {
		input_state.sendKeys(string);
	}
	
	public void clickOnPIN(String string) {
		input_pin.sendKeys(string);
	}
	
	public void clickOnInputTelephone(String string) {
		input_telephone.sendKeys(string);
	}
	
	public void clickOnEmailId(String string) {
		input_emailid.sendKeys(string);
	}
	
	public void clickOnPassword(String string) {
		input_password.sendKeys(string);
	}
	
	public void clickOnSubmit() {
		btn_submit.click();
	}
	
	public void TakeTheSSofDetails() throws IOException {
		ss.takeTheScreenShot();
	}
	
	public String GetTheTextOfCuxtomerID() {
		return getTxt_ofCustomerId.getText();
	}
	
	public void clickOnContinueButton() {
		btn_continue.click();
	}

}
