package pages.BancoUnion;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.BaseTest;

public class SearchResults extends BaseTest {
	

	public void navToSearchResults() {

		;

		List<WebElement> linkOccurence = driver.findElement(table).findElements(By.tagName("a"));
	    for(WebElement ele : linkOccurence){

	        if (ele.getText().equalsIgnoreCase("Modelos de contrato")) {
	        	ele.click();
	        	break;
	        }
	    } 
	    	
		
	}


    //Locators
    By table = By.xpath("//table[@class='contentpaneopen_buscar_resul']//tr[1]");

	

}
