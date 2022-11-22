package CommonMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotMethods {
	
	private WebDriver driver;
	public ScreenShotMethods(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void takeTheScreenShot() throws IOException {
		TakesScreenshot sr = (TakesScreenshot)driver;
		File source=sr.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat dd=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss ");
		Date date= new Date();
		String actualDate=dd.format(date);
		
		String path=System.getProperty("user.dir")+"/screenshot/"+actualDate+"bhiki.png";
		
		
		
		File target=new File(path);
		FileUtils.copyFile(source, target);
}

}
