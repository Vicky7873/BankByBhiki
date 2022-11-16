package configReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	static Properties pr=new Properties();
	
	public static String getConfigReader(String key) {
		String path="C:\\Users\\User\\Bhiki_AutoMation\\bank\\src\\test\\resources\\config.properties";
		FileInputStream fs;
		try {
			fs = new FileInputStream(path);
			try {
				pr.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String value=pr.get(key).toString();
		return value;

	}
	
	
}
