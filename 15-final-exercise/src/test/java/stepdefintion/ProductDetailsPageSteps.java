package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ProductDetailsPageSteps {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(Hooks.getDriver());

    @Then("^on the product details page the product name is (.+) as expected$")
    public void onTheProductDetailsPageTheProductNameIsXAsExpected(String product) {
        Assertions.assertEquals(productDetailsPage.getDetailProductName(), product);
    }

    @And("^the product price is (.+) on the product detail page as expected$")
    public void theProductPriceIsXOnTheProductDetailPageAsExpected(String price) {
        Assertions.assertEquals(productDetailsPage.getDetailProductPrice(), price);
    }
}
