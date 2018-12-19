package pages.Meristation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.BaseTest;

import java.util.List;

public class ConkersBadFurDay extends BaseTest {

    public void selectTabFromGame(String tabName){
        WebElement tabs = driver.findElement(tabList);
        List<WebElement> options = tabs.findElements(By.tagName("li"));

        for (WebElement option : options)
        {
            if (option.getText().equals(tabName))
            {
                option.click();
                break;
            }
        }

    }

    public void navigateTabPageLink(){
        driver.findElement(tab_pageLink).click();
    }

    public void verifyPageTitle(String title){

        String actual_title = driver.findElement(trucos_title).getText();
        Assert.assertTrue(actual_title.equalsIgnoreCase(title));
    }


    //Locators
    By tabList = By.cssSelector("ul.j-sb");
    By tab_pageLink = By.cssSelector("h2 > a");
    By trucos_title = By.cssSelector("div > h1");

}
