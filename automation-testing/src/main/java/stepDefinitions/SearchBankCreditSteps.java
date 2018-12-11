package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BancoUnion.ContractModels;
import pages.BancoUnion.HomePage;
import pages.BancoUnion.SearchCredits;
import pages.BancoUnion.SearchResults;

public class SearchBankCreditSteps {

    HomePage home = new HomePage();
    SearchCredits search = new SearchCredits();
    SearchResults results = new SearchResults();
    ContractModels table = new ContractModels();

    @Given("^I navigate to 'Mapa del Sitio > Buscar' page$")
    public void navigateToSearch(){
        home.navigateToBuscar();
    }

    @When("^I look for 'credito' in the searchbox$")
    public void searchForCredits(){
        search.searchText();
    }

    @And("^I open 'Modelos de contrato' page result$")
    public void navigateToModelosDeContrato(){
        results.navToSearchResults();
    }

    @Then("^I verify that the table has 17 items$")
    public void verifyTableItems(){
        table.get_numberRows();
    }
}
