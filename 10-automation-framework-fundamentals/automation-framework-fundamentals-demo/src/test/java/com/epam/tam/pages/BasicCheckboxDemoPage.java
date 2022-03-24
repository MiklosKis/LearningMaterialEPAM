package com.epam.tam.pages;

import com.epam.tam.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicCheckboxDemoPage extends PageObject {

    public BasicCheckboxDemoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#isAgeSelected")
    WebElement checkbox;

    @FindBy(css = "div#txtAge")
    WebElement checkboxMsg;

    public void checkAgeCheckbox(){
        checkbox.click();
    }

    public boolean isAgeChecboxChecked(){
        return checkbox.isSelected();
    }

    public String getAgeCheckboxMsg(){
        return checkboxMsg.getText();
    }
}
