package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.CategoryPage;
import io.cucumber.java.en.When;

public class CategoryPageSteps {
    CategoryPage categoryPage = new CategoryPage(Hooks.getDriver());

    @When("^click on add to cart button for the first product$")
    public void clickOnAddToCartButtonForTheFirstProduct() {
        categoryPage.clickFirstAddToCartButton();
    }
}
