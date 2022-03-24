package com.epam.tam.pages;

import com.epam.tam.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicRadioButtonDemoPage extends PageObject {

    public BasicRadioButtonDemoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[value=Male][name=optradio]")
    WebElement maleRadioButton;

    @FindBy(css = "button#buttoncheck")
    WebElement getCheckedValueButton;

    @FindBy(css = "p.radiobutton")
    WebElement radioButtonMsg;

    public void clickOnMaleRadioButton(){
        maleRadioButton.click();
    }

    public boolean isMaleRadioButtonSelected(){
        return maleRadioButton.isSelected();
    }

    public void clickOnGetCheckedValueButton(){
        getCheckedValueButton.click();
    }

    public String getRadioButtonMsg(){
        return radioButtonMsg.getText();
    }
}
