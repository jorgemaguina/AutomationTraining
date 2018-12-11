package pages.Meristation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.BaseTest;

public class ConkersBadFurDay extends BaseTest {

    public void selectTrucosTab(){
        driver.findElement(trucos_tab).click();
    }

    public void navigateTrucosPage(){
        driver.findElement(trucos_page).click();
    }

    public void verifyTrucosTitle(){

        String actual_title = driver.findElement(trucos_title).getText();
        Assert.assertTrue(actual_title.equalsIgnoreCase("Conker's Bad Fur Day"));
    }


    //Locators
    By trucos_tab = By.cssSelector("ul.j-sb > li:nth-child(6) > a");
    By trucos_page = By.cssSelector("h2 > a");
    By trucos_title = By.cssSelector("div > h1");

}
