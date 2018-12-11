package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContractModels;
import pages.HomePage;
import pages.SearchCredits;
import pages.SearchResults;

// Test automatizado para el Banco Union 
public class SearchTests extends BaseTest{
	
	
	@Test
	public void verifyNumberOfTableItems() {
		
		HomePage home = new HomePage();
		home.navigateToBuscar();
		
		SearchCredits search = new SearchCredits();
		search.searchText();
		
		SearchResults results = new SearchResults();
		results.navToSearchResults();
		
		ContractModels base= new ContractModels();
		Assert.assertTrue(17 == base.get_numberRows());
		
	}

}
