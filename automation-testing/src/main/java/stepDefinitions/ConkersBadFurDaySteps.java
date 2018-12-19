package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Meristation.ConkersBadFurDay;
import pages.Meristation.HomePage;
import pages.Meristation.Nintendo64;

public class ConkersBadFurDaySteps {

    HomePage home= new HomePage();
    Nintendo64 nintendo = new Nintendo64();
    ConkersBadFurDay game = new ConkersBadFurDay();

    @Given("^I navigate to MAS > NINTENDO 64 page$")
    public void goToNintendo64Platform(){
        home.accept_cookies();
        home.navToNintendo();

    }

    @When("^I click on \"(.*)\" in the TOP 10 section$")
    public void clickTopTenGame(String game) {

        nintendo.navigateToTopGame(game);
    }

    @And("^I select \"(.*)\" tab$")
    public void selectTab(String tab) {

        game.selectTabFromGame(tab);
    }

    @And("^I click on the link displayed$")
    public void navigateToGameTitle() {

        game.navigateTabPageLink();

    }

    @Then("^I verify that \"(.*)\" title is displayed$")
    public void verifyPageTitleIsDisplayed(String titlePage) {

        game.verifyPageTitle(titlePage);

    }
}
