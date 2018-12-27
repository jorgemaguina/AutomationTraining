package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InternetExplorerDriverManager {

    private WebDriver driver;

    public WebDriver getDriver() {

        System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer.exe");
        this.driver = new InternetExplorerDriver();
        return this.driver;
    }
}
