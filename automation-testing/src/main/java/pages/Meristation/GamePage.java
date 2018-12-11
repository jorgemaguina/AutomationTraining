package pages.Meristation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.BaseTest;

public class GamePage extends BaseTest {

	
	public void selectPs3(String str) {
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
	
	public boolean verify_voicesLabel(){
		
		
		if (driver.findElement(voices_lb).isDisplayed() == true){
			return true;
		}
		else{
			return false;
		}
			
	}
	
	public boolean verify_voicesValue(){
		
		
		if (driver.findElement(voices_val).isDisplayed() == true){
			return true;
		}
		else{
			return false;
		}
			
	}

	public void navigateToDeveloper(){
		driver.findElement(game).click();
	}
	
	public boolean verifyDeveloperPageUrl(){

		if (driver.getCurrentUrl().equalsIgnoreCase("https://as.com/meristation/empresas/ea_dice/") ){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Locators
	By releases = By.cssSelector("#tabs-releases > ul");
	By voices_lb = By.cssSelector("div.tab-ct.sel > div.mod-li > ul > li:nth-child(1) > span.lbl");
	By voices_val = By.cssSelector("div.tab-ct.sel > div.mod-li > ul > li:nth-child(1) > span.val");
	By game = By.cssSelector("a[title='EA DICE, empresa desarrolladora de Battlefield 4: China Rising']");
}
