package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {

	public static WebDriver driver;
	public WebDriverWait wait;
	public Long timeOut;
	
	
	@Before
	public  void driverSetup(){
		
		ReadProperties prop = new ReadProperties();
		prop.readPropertiesFile();
		System.setProperty(prop.getPropertyValue("ff_driver"),prop.getPropertyValue("driver_location"));
		driver = new FirefoxDriver();
		driver.get(prop.getPropertyValue("url"));
		timeOut= prop.getPropertyTimeout("timeout");
		wait = new WebDriverWait(driver,30);

	}
	
	@After
	public void driverClose() {

		driver.quit();
	}


}
