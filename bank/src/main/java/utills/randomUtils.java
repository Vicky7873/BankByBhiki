package utills;

import org.apache.commons.lang3.RandomStringUtils;

public class randomUtils {

	public String setTheEmailForTC_9_step() {
		String RandomEmail=RandomStringUtils.randomAlphabetic(5);
		return RandomEmail+"@gmail.com";
	}

}
