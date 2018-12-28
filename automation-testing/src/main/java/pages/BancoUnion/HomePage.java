package pages.BancoUnion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.BaseTest;
import stepDefinitions.ReadProperties;

public class HomePage extends BaseTest {

	private ReadProperties prop = new ReadProperties();

	public void navigateToBuscar(){
		mapa_del_sitio().click();
		search().click();
	}
	
	
	//Locators

	public WebElement search (){return driver.findElement(By.xpath("//a[contains(text(), 'Buscar')]"));}
	public WebElement mapa_del_sitio (){return driver.findElement(By.xpath("//a[@title='register']"));}
	public void getBankUrl(){
		prop.readPropertiesFile();
		String urlBank = prop.getPropertyValue("url_bank");
		driver.get(urlBank);

	}

}
