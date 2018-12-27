package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {

	private DriverFactory factory = new DriverFactory();
	public static WebDriver driver;
	private ReadProperties prop = new ReadProperties();

	public WebDriverWait wait;
	public Long timeOut;

	
	@Before
	public  void driverSetup(){

		prop.readPropertiesFile();
		this.driver = factory.getDriverType(prop.getPropertyValue("ie"));

	}
	
	@After
	public void driverClose() {

		driver.quit();
	}





}
