package pages.Meristation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.BaseTest;

import java.util.List;

public class Nintendo64 extends BaseTest {

    public void navigateToTopGame(String topGame){

        WebElement game_list = driver.findElement(top_games);
        List<WebElement> options = game_list.findElements(By.tagName("a"));

        for (WebElement option : options)
        {
            if (option.getText().equals(topGame))
            {
                option.click();
                break;
            }
        }
    }

    //Locators
    By top_games = By.cssSelector("div.li-flex-wr > ol.li-num");
}
