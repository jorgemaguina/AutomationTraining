package pages.Meristation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import stepDefinitions.BaseTest;

import java.util.List;


public class HomePage extends BaseTest{

	//Method to focus over Platform menu
	public void focusMenu() {
		driver.findElement(By.cssSelector(".n-md-8 > article:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).click();
		Actions builder = new Actions(driver);
		builder.moveToElement(plataforma).build().perform();
		
	}
	
	//Method to click Nintendo64 page
	public void navigateToNintendo(){
		
		List <WebElement> options = list.findElements(By.tagName("li"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.tagName("li"))));
		if(options.size() > 0)
		try {
			driver.findElement(nintendo64).click();
		}
		catch (Exception e){
			
			System.out.println("Exception occurred");
			
		}
	}
		
		public void accept_cookies(){
			
			accept_btn.click();
		}
		
		public void navigate_Top(){
			top_mainMenu.click();
			
		}
		public void navToNintendo(){
			String url = driver.getCurrentUrl();
			String newUrl = url+"plataformas/nintendo_64/";
			driver.get(newUrl);
		}
		
	
	
	//Locators
	 WebElement accept_btn = driver.findElement(By.cssSelector("div.banner_info--3MsMT > a:nth-child(2) > span"));
	 WebElement top_mainMenu = driver.findElement(By.cssSelector("a[title='Los mejores videojuegos']"));
	 WebElement plataforma = driver.findElement(By.cssSelector("li.sub:nth-child(6)"));
	 By nintendo64 = By.cssSelector("a[title='Últimas noticias de Nintendo 64']");
	 WebElement list = driver.findElement(By.cssSelector("ul.nav-sec.nav-plat > li.nav-i.sub.double-col > div > ul"));
	 
	 
}

