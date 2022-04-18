package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SearchResultPageSteps {
    SearchResultPage searchResultPage = new SearchResultPage(Hooks.getDriver());

    @Then("^the search result will match the (.+) searched term$")
    public void theSearchResultWillMatchTheXSearchedTerm(String searchedTerm) {
        Assertions.assertTrue(searchResultPage.getSearchedProductName().contains(searchedTerm));
    }

    @When("^click on the see more button for the first product$")
    public void clickOnTheSeeMoreButtonForTheFirstProduct() {
        searchResultPage.clickSeeMoreButton();
    }
}
