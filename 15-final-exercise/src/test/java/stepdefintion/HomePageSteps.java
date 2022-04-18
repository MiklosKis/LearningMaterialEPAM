package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage(Hooks.getDriver());

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        homePage.clickOnSignInButton();
    }

    @When("^I click on Contact us link$")
    public void iClickOnContactUsLink() {
        homePage.clickOnContactUsButton();
    }

    @And("^I type in (.+) in the searchbar$")
    public void iTypeInXInTheSearchbar(String searchProduct) {
        homePage.typeIntoSearchBar(searchProduct);
    }

    @When("^click the search button$")
    public void clickTheSearchButton() {
        homePage.clickSearchButton();
    }

    @And("^I click on Casual Dresses in menu$")
    public void iClickOnCasualDressesInMenu() {
        homePage.clickOnCasualDresses();
    }
}
