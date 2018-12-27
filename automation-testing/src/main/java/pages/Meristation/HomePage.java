package pages.Meristation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import stepDefinitions.BaseTest;
import stepDefinitions.ReadProperties;

import java.util.List;


public class HomePage extends BaseTest{

	ReadProperties prop = new ReadProperties();

	//Method to focus over Platform menu
	public void focusMenu() {
		driver.findElement(By.cssSelector(".n-md-8 > article:nth-child(1) > div:nth-child(2) > p:nth-child(3)")).click();
		Actions builder = new Actions(driver);
		builder.moveToElement(plataforma()).build().perform();
		
	}
	
	//Method to click Nintendo64 page
	public void navigateToNintendo(){
		
		List <WebElement> options = list().findElements(By.tagName("li"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By.tagName("li"))));
		if(options.size() > 0)
		try {
			driver.findElement(nintendo64).click();
		}
		catch (Exception e){
			
			System.out.println("Exception occurred");
			
		}
	}
	public void getGameUrl(){
		prop.readPropertiesFile();
		String urlGame = prop.getPropertyValue("url");
		driver.get(urlGame);
	}
		
	public void accept_cookies(){
			
			accept_btn().click();
	}
		
	public void navigate_Top(){
			top_mainMenu().click();
			
	}

	public void navToNintendo(){
			String url = driver.getCurrentUrl();
			String newUrl = url+"plataformas/nintendo_64/";
			driver.get(newUrl);
	}
		
	
	
	//Locators
	 public WebElement accept_btn(){return driver.findElement(By.cssSelector("div.banner_info--3MsMT > a:nth-child(2) > span"));}
	 public WebElement top_mainMenu() { return driver.findElement(By.cssSelector("a[title='Los mejores videojuegos']"));}
	 public WebElement plataforma() {return driver.findElement(By.cssSelector("li.sub:nth-child(6)"));}
	 By nintendo64 = By.cssSelector("a[title='Últimas noticias de Nintendo 64']");
	 public WebElement list() {return driver.findElement(By.cssSelector("ul.nav-sec.nav-plat > li.nav-i.sub.double-col > div > ul"));}

	 
}

