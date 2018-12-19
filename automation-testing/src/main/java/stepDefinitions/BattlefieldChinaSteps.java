package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Meristation.GamePage;
import pages.Meristation.HomePage;
import pages.Meristation.TopPage;

public class BattlefieldChinaSteps {

    HomePage home = new HomePage();
    TopPage top = new TopPage();
    GamePage game = new GamePage();

    @Given("^I navigate to TOP page$")
    public void navigateToTopPage(){
        home.accept_cookies();
        home.navigate_Top();
    }

    @When("^I select \"(.*)\" in platform dropdown$")
    public void filterGamesListPlatform (String platformOpt){

        top.selectPlatformOption(platformOpt);
    }

    @And("^I select \"(.*)\" in genre dropdown$")
    public void filterGamesListGenre(String genreOpt){
        top.selectGenreOption(genreOpt);
    }

    @And("^I select \"(.*)\" in year dropdown$")
    public void filterGamesListYear(String yearOpt){

        top.selectYearOption(yearOpt);
    }

    @And("^I click on the \"(.*)\" game$")
    public void navigateToBattlefieldGame(String gameLink){
        top.clickBattlefieldGame(gameLink);
    }

    @And("^I select \"(.*)\" in ficha tecnica$")
    public void selectTabFromDataSheet(String option){

        game.selectOptionFromData(option);
    }

    @Then("^I verify that \"(.*)\" label and \"(.*)\" text are displayed$")
    public void verifyElementsPresent(String label , String text){
        game.verifyValues(label, text);
    }

    @When("^I click on 'Developer' link$")
    public void navigateToDeveloperPage(){
        game.navigateToDeveloper();
    }

    @Then("^I verify that the correct url \"(.*)\" is displayed$")
    public void verifyCurrentURL(String url){
        game.verifyDeveloperPageUrl(url);
    }



}
