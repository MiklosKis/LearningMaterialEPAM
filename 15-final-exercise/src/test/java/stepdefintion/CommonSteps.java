package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.CommonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CommonSteps {
    CommonPage commonPage = new CommonPage(Hooks.getDriver());

    @Given("^I navigate to (.+) url$")
    public void iNavigateToXUrl(String url) {
        Hooks.getDriver().get(url);
    }

    @Then("^the expected product (.+) is added to the cart$")
    public void theExpectedProductXIsAddedToTheCart(String expectedProductName) {
        Assertions.assertEquals(commonPage.getPopupSuccessMessage(),
                "Product successfully added to your shopping cart");
        Assertions.assertEquals(commonPage.getPopupProductName(),
                expectedProductName);
        Assertions.assertEquals(commonPage.getPopupProductQuantity(),
                "1");
    }

    @When("^click on proceed to checkout button$")
    public void clickOnProceedToCheckoutButton() {
        commonPage.clickProceedToCheckoutButton();
    }
}
