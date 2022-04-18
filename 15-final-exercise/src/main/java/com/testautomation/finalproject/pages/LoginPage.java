package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import com.testautomation.finalproject.utils.WebElementHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.testautomation.finalproject.hooks.Hooks.getDriver;
import static com.testautomation.finalproject.utils.WebElementHandler.clickButton;
import static com.testautomation.finalproject.utils.WebElementHandler.sendTextToField;

public class LoginPage extends PageObject {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#email")
    WebElement emailField;

    @FindBy(css = "#passwd")
    WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    WebElement submitLoginButton;

    @FindBy(css = ".alert-danger li")
    WebElement validationMessage;


    public void addEmailAddress(String emailAddress) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("document.getElementById('email').setAttribute('value', '" + emailAddress + "')");
    }

    public void addPassword(String password) {
        sendTextToField(password, "Password", passwordField);
    }

    public void clickSubmitButton() {
        clickButton(getDriver(), "Sign in", submitLoginButton);
    }

    public String getValidationMessage() {
        return validationMessage.getText();
    }
}
