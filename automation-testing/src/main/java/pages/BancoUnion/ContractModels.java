package pages.BancoUnion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.BaseTest;

public class ContractModels extends BaseTest{
	
	
	public int get_numberRows() {

		List<WebElement> rows = driver.findElement(table).findElements(By.xpath("./tr"));
		int result = rows.size();
		return result;
		
	}

	By table = By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div/table/tbody");

	
}