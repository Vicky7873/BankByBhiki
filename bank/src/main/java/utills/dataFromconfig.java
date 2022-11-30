package utills;

import configReader.ConfigReader;

public class dataFromconfig {
	
     public static String UserID=ConfigReader.getConfigReader("UserID");
	 public static String psw=ConfigReader.getConfigReader("password");

}
