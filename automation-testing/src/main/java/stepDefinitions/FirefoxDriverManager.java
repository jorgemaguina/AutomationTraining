package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements DriverManager {

    private WebDriver driver;

    public WebDriver getDriver() {

        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src//drivers//geckodriver.exe");
        this.driver = new FirefoxDriver();
        return this.driver;
    }
}
