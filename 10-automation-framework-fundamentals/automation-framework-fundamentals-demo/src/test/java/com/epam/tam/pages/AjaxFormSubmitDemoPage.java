package com.epam.tam.pages;

import com.epam.tam.utils.PageObject;
import com.epam.tam.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AjaxFormSubmitDemoPage extends PageObject {
    private final WebDriver driver;

    public AjaxFormSubmitDemoPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(css = "input#title")
    private WebElement nameField;

    @FindBy(css = "textarea#description")
    private WebElement commentField;

    @FindBy(css = "input#btn-submit")
    private WebElement submitButton;

    @FindBy(id = "submit-control")
    private WebElement submitMsg;

    @FindBy(className = "validation-error")
    private WebElement validationError;

    public void writeName(String name) {
        nameField.sendKeys(name);
    }

    public void writeComment(String comment) {
        commentField.sendKeys(comment);
    }

    public void pressSubmit() {
        submitButton.click();
    }

    public String getSubmitMsg(){
        return submitMsg.getText();
    }

    public boolean isErrorMsgDisplayed(){
        return validationError.isDisplayed();
    }

    public void clearNameField(){
        nameField.clear();
    }

    public void clearCommentField(){
        commentField.clear();
    }

    public boolean getSubmitMsgDisplayed(String msg) {
        Waiters waiters = new Waiters(driver,10);
        return  waiters.waitingForTextToBePresent(By.cssSelector("div#submit-control"), msg);
    }

}
