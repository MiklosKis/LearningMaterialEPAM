package stepdefintion;

import com.testautomation.finalproject.hooks.Hooks;
import com.testautomation.finalproject.pages.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ContactUsPageSteps {
    private ContactUsPage contactUsPage = new ContactUsPage(Hooks.getDriver());

    @And("^fill out the form with valid data$")
    public void fillOutTheFormWithValidData() {
        contactUsPage.selectSubjectHeading("1");
        contactUsPage.addEmailAddress();
        contactUsPage.addOrderReference("1234");
        contactUsPage.addMessageToForm("Test message.");
    }

    @And("^click on send button$")
    public void clickOnSendButton() {
        contactUsPage.clickSubmitButton();
    }

    @Then("^the (.+) success message is displayed$")
    public void theXSuccessMessageIsDisplayed(String msg) {
        Assertions.assertEquals(contactUsPage.getSuccessMessage(msg), msg);
    }
}
