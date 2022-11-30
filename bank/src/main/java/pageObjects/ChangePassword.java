package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import CommonMethods.IframeHandle;
import CommonMethods.alertMethod;

public class ChangePassword {
	
	private WebDriver driver;
	alertMethod alt;
	IframeHandle iframe;
	public ChangePassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		alt=new alertMethod(driver);
		iframe=new IframeHandle(driver);
	}
	
	@FindBy(xpath="//a[contains(text(),\"Change Password\")]")
	@CacheLookup
	WebElement button_changePassword;
	
	@FindBy(xpath="//*[@name=\"oldpassword\"]")
	@CacheLookup
	WebElement enterText_OldPassword;
	
	@FindBy(xpath="//*[@name=\"newpassword\"]")
	@CacheLookup
	WebElement enterText_newPassword;
	
	@FindBy(xpath="//*[@name=\"confirmpassword\"]")
	@CacheLookup
	WebElement enterTxt_confirmpassword;
	
	@FindBy(xpath="//*[@type=\"submit\"]")
	@CacheLookup
	WebElement btn_submit;
	
	@FindBy(xpath="//div[@id=\"dismiss-button\" and @class=\"btn skip\"]")
	@CacheLookup
	WebElement AD_dismiss_button;
	
	@FindBy(xpath="//div[@id=\"dismiss-button\" and @aria-label=\"Close ad\"]")
	@CacheLookup
	WebElement ad2_dismissBtn;
	
	public void clickOnChangePassword() {
		button_changePassword.click();
	}
	
	public void waitForAlert() {
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//		alert.dismiss();
		iframe.switchtoframeByElementID("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
		if(alt.WaitForWebDriverWait(20).until(ExpectedConditions.elementToBeClickable(AD_dismiss_button))!=null) {
			System.out.println("Button is displayed");
			AD_dismiss_button.click(); 
		}
		else if(ad2_dismissBtn.isDisplayed()){
			ad2_dismissBtn.click();
		}
		else {
			iframe.switchtoframeByElementID("ad_iframe");
			AD_dismiss_button.click();
		}
		
		
	}
	
	public void enterOldpassword(String oldPassword) {
		enterText_OldPassword.clear();
		enterText_OldPassword.sendKeys(oldPassword);
	}
	
	public void enterNewPassword(String newPassword) {
		enterText_newPassword.clear();
		enterText_newPassword.sendKeys(newPassword);
	}
	
	public void enterCOnfirmPassword(String confirmPassword) {
		enterTxt_confirmpassword.clear();
		enterTxt_confirmpassword.sendKeys(confirmPassword);
	}
	
	public void clickOnsubmit() {
		btn_submit.click();
	}
	
	public String validateThePopup() {
		alt.switchToAlert();
		return alt.GetTheTextOfAlertThenAcceptIT();
	}
	
	public void acceptThePoPup() {
		alt.aceeptTheAlert();
	}
	
	public void enterTheCorrectPassoword() {
		enterText_OldPassword.sendKeys("Bhiki@123");
	}
	
	public void GetTheTitleOfLoginPage() {
		System.out.println(driver.getTitle());
	}
}
