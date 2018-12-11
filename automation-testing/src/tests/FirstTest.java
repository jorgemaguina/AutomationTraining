package tests;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GamePage;
import pages.HomePage;
import pages.TopPage;

//Test automatizado para MeriStation page
public class FirstTest extends BaseTest{
	

	@Test
	public void VerifyDeveloperPageAccess(){
		
		HomePage home = new HomePage();
		home.accept_cookies();
		home.navigate_Top();
		
		
		TopPage top = new TopPage();
		top.selectPlatformOption("PlayStation 4");
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		top.selectGenreOption("Acción");
		top.selectYearOption("2013");
		
		top.clickBattlefieldGame();
		
		GamePage game = new GamePage();
		game.selectPs3("PS3");
		Assert.assertEquals(true, game.verify_voicesLabel());
		Assert.assertEquals(true, game.verify_voicesValue());
		Assert.assertEquals(true, game.verifyDeveloperPageUrl());
				
	 }

	 
}

