package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(Hooks.getDriver());

    @And("^on Sign in page I click on Sign in button$")
    public void onSignInPageIClickOnSignInButton() {
        loginPage.clickSubmitButton();
    }

    @Then("^the (.+) validation message is displayed$")
    public void theXValidationMessageIsDisplayed(String msg) {
        Assertions.assertEquals(msg, loginPage.getValidationMessage());
    }

    @When("^add email address (.+) to email field$")
    public void addEmailAddressXToEmailField(String emailAddress) {
        loginPage.addEmailAddress(emailAddress);
    }

    @And("^add invalid password (.+) to password field$")
    public void addInvalidPasswordXToPasswordField(String password) {
        loginPage.addPassword(password);
    }
}
