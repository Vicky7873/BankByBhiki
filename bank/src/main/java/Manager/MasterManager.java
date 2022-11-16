package Manager;

public class MasterManager {
	
	private WebDriverManger webdriverManger;
	private PageObjectManager pom;
	
	public MasterManager() {
		webdriverManger=new WebDriverManger();
		pom= new PageObjectManager(webdriverManger.SetTheDriver());
	}
	
	public WebDriverManger getWebDriverManager() {
		return webdriverManger;
	}
	public PageObjectManager getPOM() {
		return pom;
	}

}
