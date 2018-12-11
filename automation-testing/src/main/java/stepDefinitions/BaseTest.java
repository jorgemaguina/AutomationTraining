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
		
		ReadProperties.readPropertiesFile();
		System.setProperty(ReadProperties.getPropertyValue("ff_driver"),ReadProperties.getPropertyValue("driver_location"));
		driver = new FirefoxDriver();
		driver.get(ReadProperties.getPropertyValue("url"));
		timeOut= ReadProperties.getPropertyTimeout("timeout");
		wait = new WebDriverWait(driver,30);
	}
	
	@After
	public void driverClose() {
		driver.quit();
	}


}
