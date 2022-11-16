package utills;

import configReader.ConfigReader;

public class dataFromconfig {
	
	public static String UserID=ConfigReader.getConfigReader("UserID");
	public static String Password=ConfigReader.getConfigReader("password");

}
