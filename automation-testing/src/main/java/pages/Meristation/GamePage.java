package pages.Meristation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.BaseTest;

public class GamePage extends BaseTest {

	
	public void selectOptionFromData(String str) {
		List <WebElement> options = driver.findElement(releases).findElements(By.tagName("li"));
		  
		  for (WebElement option : options)
		  {
		      if (option.getText().equals(str))
		      {
		    	  option.click();
		          break;
		      }
		  }
				
	}
	
	public boolean verifyLabelDisplayed(String label){

		List <WebElement> listLabels = driver.findElements(labels);

		for (WebElement option : listLabels)
		{
			if (option.isDisplayed() && option.getText().equals(label))
			{
				return true;

			}

		}
		return false;
	}
	
	public boolean verifyValueIsDisplayed(String val){

		List <WebElement> listValues = driver.findElements(values);

		for (WebElement option : listValues)
		{
			String text = option.getText();
			if (option.isDisplayed() && option.getText().equals(val))
			{
				return true;

			}

		}
		return false;
	}

	public void navigateToDeveloper(){
		driver.findElement(game).click();
	}
	
	public void verifyDeveloperPageUrl(String urlDev){

        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(urlDev));

	}
	
	//Locators
	By releases = By.cssSelector("#tabs-releases > ul");
	By labels = By.cssSelector("div.tab-ct.sel > div.mod-li > ul > li > span.lbl");
	By values = By.cssSelector("div.tab-ct.sel > div.mod-li > ul > li > span.val");
	By game = By.cssSelector("a[title='EA DICE, empresa desarrolladora de Battlefield 4: China Rising']");
}
