package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class CheckoutPageSteps {
    CheckoutPage checkoutPage = new CheckoutPage(Hooks.getDriver());

    @Then("^the expected product (.+) and quantity is (.+) is in the cart$")
    public void theExpectedProductXIsInTheCart(String expectedProductName, String expectedProductQuantity) {
        Assertions.assertEquals(checkoutPage.getProductName(),
                expectedProductName);
        Assertions.assertEquals(checkoutPage.getProductQuantity(),
                expectedProductQuantity);
    }
}
