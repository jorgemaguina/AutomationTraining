package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepDefinitions.DriverManager;

public class ChromeDriverManager implements DriverManager {

    private WebDriver driver;

    public WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
