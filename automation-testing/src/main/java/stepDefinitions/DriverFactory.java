package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    WebDriver driver;
    ChromeDriverManager ch = new ChromeDriverManager();
    FirefoxDriverManager ff = new FirefoxDriverManager();
    InternetExplorerDriverManager ie = new InternetExplorerDriverManager();


    public WebDriver getDriverType(String type){

        if (type.equalsIgnoreCase("Chrome")){

            driver = ch.getDriver();
        }
        else if (type.equalsIgnoreCase("FireFox")){
            driver = ff.getDriver();
        }
        else if (type.equalsIgnoreCase("InternetExplorer")){
            driver = ie.getDriver();
        }
        return driver;
    }
}
