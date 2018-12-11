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
    public void goToNintendo64Platform() throws Throwable {
        home.accept_cookies();
        home.navToNintendo();

    }

    @When("^I click on 'Conker's Bad Fur Day' in the 'TOP 10' section$")
    public void clickConkersBadFurDayGame() {

        nintendo.navigateToConkersBadFur();
    }

    @And("^I select 'Trucos' tab$")
    public void selectTabTrucos() {

        game.selectTrucosTab();
    }

    @And("^I click on 'Conker's Bad Fur Day' title$")
    public void navigateToGameTrucos() {

        game.navigateTrucosPage();

    }

    @Then("^I verify that 'Conker's Bad Fur Day' title is displayed$")
    public void verifyTitleInTrucos() {

        game.verifyTrucosTitle();

    }


}
