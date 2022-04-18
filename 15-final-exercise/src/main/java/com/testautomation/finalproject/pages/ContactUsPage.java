package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.testautomation.finalproject.hooks.Hooks.getDriver;
import static com.testautomation.finalproject.utils.Waiters.waitForTextToBePresent;
import static com.testautomation.finalproject.utils.WebElementHandler.clickButton;
import static com.testautomation.finalproject.utils.WebElementHandler.sendTextToField;

public class ContactUsPage extends PageObject {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#id_contact")
    WebElement dropdown;

    @FindBy(css= "#email")
    WebElement emailField;

    @FindBy(css = "#id_order")
    WebElement orderReferenceField;

    @FindBy(css = "#message")
    WebElement messageArea;

    @FindBy(css = "#submitMessage")
    WebElement submitButton;

    @FindBy(css = ".alert-success")
    WebElement successMessage;


    public void selectSubjectHeading(String option) {
        Select select = new Select(dropdown);
        select.selectByValue(option);
    }

    public void addEmailAddress() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("document.getElementById('email').setAttribute('value', 'test@test.com')");
    }

    public void addOrderReference(String orderReference) {
        sendTextToField(orderReference, "Order reference", orderReferenceField);
    }

    public void addMessageToForm(String message) {
        sendTextToField(message, "Message field", messageArea);
    }

    public void clickSubmitButton() {
        clickButton(getDriver(),"Submit", submitButton);
    }

    public String getSuccessMessage(String msg) {
        waitForTextToBePresent(getDriver(), ".alert-success", msg);
        return successMessage.getText();
    }
}
