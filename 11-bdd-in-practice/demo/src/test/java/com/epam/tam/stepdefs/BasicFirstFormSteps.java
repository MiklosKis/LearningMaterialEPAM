package com.epam.tam.stepdefs;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.BasicFirstFormPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BasicFirstFormSteps {
    private BasicFirstFormPage basicFirstFormPage = new BasicFirstFormPage(Hooks.getDriver());

    @When("^I write (.+) into the single input field$")
    public void iWriteTextIntoTheSingleInputField(String text) {
        basicFirstFormPage.writeIntoSingleInputField(text);
    }

    @And("^Press the show message button$")
    public void pressTheShowMessageButton() {
        basicFirstFormPage.clickOnShowMessageButton();
    }

    @Then("^The (.+) should be displayed$")
    public void theTextShouldBeDisplayed(String expectedText) {
        Assert.assertEquals(expectedText, basicFirstFormPage.getYourMessageDisplayText());
    }

}
