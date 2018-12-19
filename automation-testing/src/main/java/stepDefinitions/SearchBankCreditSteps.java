package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BancoUnion.ContractModels;
import pages.BancoUnion.HomePage;
import pages.BancoUnion.SearchCredits;
import pages.BancoUnion.SearchResults;

public class SearchBankCreditSteps {

    private HomePage home = new HomePage();
    private SearchCredits search = new SearchCredits();
    private SearchResults results = new SearchResults();
    private ContractModels table = new ContractModels();

    @Given("^I navigate to 'Mapa del Sitio > Buscar' page$")
    public void navigateToSearch(){
        home.navigateToBuscar();
    }

    @When("^I look for \"(.*)\" in the searchbox$")
    public void searchForCredits(String searchText){

        search.searchText(searchText);
    }

    @And("^I open \"(.*)\" page result$")
    public void navigateToModelosDeContrato(String link){
        results.navToSearchResults(link);
    }

    @Then("^I verify that the table has \"(.*)\" items$")
    public void verifyTableItems(Integer numb){
        int rows = table.get_numberRows();
        Assert.assertTrue(rows == numb);
    }
}
