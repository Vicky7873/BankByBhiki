package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configReader.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManger {
	
	static String browser=ConfigReader.getConfigReader("Browser");
	static String url=ConfigReader.getConfigReader("url");
	protected static WebDriver driver;
	public static WebDriver SetTheDriver() {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("foreFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static void setTheURl() {
		driver.get(url);
	} 

}
