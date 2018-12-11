package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @When("^I select 'PlayStation 4' in platform dropdown$")
    public void filterGamesListPlatform (){
        top.selectPlatformOption("PlayStation 4");
    }
    @And("^I select 'Action' in genre dropdown$")
    public void filterGamesListGenre(){
        top.selectGenreOption("Acción");
    }

    @And("^I select '2013' in year dropdown$")
    public void filterGamesListYear(){
        top.selectYearOption("2013");
    }
    @And("^I click on the 'Battlefield 4: China Rising' game$")
    public void navigateToBattlefieldGame(){
        top.clickBattlefieldGame();
    }

    @And("^I select 'PS3' in ficha tecnica$")
    public void selectPS3Tab(){
        game.selectPs3("PS3");
    }

    @Then("^I verify that 'Voces' label and 'Español' text are displayed$")
    public void verifyElementsPresent(){
        game.verify_voicesLabel();
        game.verify_voicesValue();
    }

    @When("^I click on 'Developer' link$")
    public void navigateToDeveloperPage(){
        game.navigateToDeveloper();
    }

    @Then("^I verify that the correct current url is displayed$")
    public void verifyCurrentURL(){
        game.verifyDeveloperPageUrl();
    }



}
