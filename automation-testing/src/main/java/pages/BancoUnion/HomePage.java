package pages.BancoUnion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.BaseTest;

public class HomePage extends BaseTest {
	
	
	public void navigateToBuscar(){
		driver.findElement(mapa_del_sitio).click();
		driver.findElement(search).click();
	}
	
	
	//Locators
	By mapa_del_sitio = By.xpath("//a[@title='register']");
	By search = By.xpath("//a[contains(text(), 'Buscar')]");


}
