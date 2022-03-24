package com.epam.tam.pages;

import com.epam.tam.utils.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicFirstFormPage extends BasePageObject {

    public BasicFirstFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#user-message.form-control")
    private WebElement enterMessageTextField;

    @FindBy(css = "#get-input > button")
    private WebElement showMessageButton;

    @FindBy(id = "display")
    private WebElement yourMessageDisplayField;

    @FindBy(css = "#sum1")
    private WebElement doubleInputFirstField;

    @FindBy(css = "#sum2")
    private WebElement doubleInputSecondField;

    @FindBy(css = "#gettotal > button")
    private WebElement getTotalButton;

    @FindBy(id = "displayvalue")
    private WebElement sum;

    public void writeIntoSingleInputField(String text){
        enterMessageTextField.sendKeys(text);
    }

    public void clickOnShowMessageButton() {
        showMessageButton.click();
    }

    public String getYourMessageDisplayText() {
        return yourMessageDisplayField.getText();
    }
}
