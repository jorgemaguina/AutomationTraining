package pages.BancoUnion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.BaseTest;

public class SearchCredits extends BaseTest {
	
	
	public void searchText (String text) {
		driver.findElement(search_input).sendKeys(text);
		driver.findElement(search_button).click();
		
	}
	
	
	//Locators
	By search_input = By.xpath("//input[@id='search_searchword']");
	By search_button = By.xpath("//input[@name='submit']");
    
}
