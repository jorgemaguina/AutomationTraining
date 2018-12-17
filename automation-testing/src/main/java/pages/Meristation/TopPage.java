package pages.Meristation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.BaseTest;



public class TopPage extends BaseTest{

	
	public void selectPlatformOption(String search_text) {
		driver.findElement(platform_drop).click();
		List <WebElement> options = driver.findElements(By.tagName("li"));
		  
		  for (WebElement option : options)
		  {
		      if (option.getText().equals(search_text))
		      {
		    	  option.click();
		          break;
		      }
		  }
	}
	
	public void selectGenreOption(String search_text) {
		
		driver.findElement(genre_drop).click();
		List <WebElement> options = driver.findElements(By.tagName("li"));
		  
		  for (WebElement option : options)
		  {
		      if (option.getText().equals(search_text))
		      {
		    	  option.click();
		          break;
		      }
		  }
		
	}
	
	public void selectYearOption(String search_text) {
		driver.findElement(year_drop).click();
		List <WebElement> options = driver.findElements(By.tagName("li"));
		  
		  for (WebElement option : options)
		  {
		      if (option.getText().equals(search_text))
		      {
		    	  option.click();
		          break;
		      }
		  }
		
	}
	
	public void clickBattlefieldGame(String game) {
		List <WebElement> options = driver.findElements(gameLinks);

		for (WebElement option : options)
		{
			if (option.getText().equals(game))
			{
				option.click();
				break;
			}
		}
		
	}
	
				

	 //LOcators
		By platform_drop = By.cssSelector("div:nth-child(1) > div > div > div.form-desp-current > span.form-value");
		By genre_drop = By.cssSelector("div:nth-child(2) > div > div > div.form-desp-current > span.form-value");
		By year_drop = By.cssSelector("div:nth-child(3) > div > div > div.form-desp-current > span.form-value");
		By gameLinks = By.cssSelector("div.ga-inf > h2 > a");
	
}
