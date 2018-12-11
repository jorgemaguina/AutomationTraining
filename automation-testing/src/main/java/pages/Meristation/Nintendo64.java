package pages.Meristation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.BaseTest;

public class Nintendo64 extends BaseTest {

    public void navigateToConkersBadFur(){

        driver.findElement(game_link).click();
    }


    //Locators
    By game_link = By.cssSelector("ol > li:nth-child(1) > a");
}
