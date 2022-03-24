package com.epam.tam.steps;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.BasicRadioButtonDemoPage;
import org.junit.jupiter.api.Assertions;

public class BasicRadioButtonDemoStep {

    private final BasicRadioButtonDemoPage basicRadioButtonDemoPage = new BasicRadioButtonDemoPage(Hooks.getDriver());

    public void clickOnMaleRadioButton(){
        basicRadioButtonDemoPage.clickOnMaleRadioButton();
    }

    public void checkTheMaleRadioButtonIsSelected(){
        Assertions.assertTrue(basicRadioButtonDemoPage.isMaleRadioButtonSelected(), "Male radio button is not selected!");
    }

    public void clickOnGetCheckedValueButton(){
        basicRadioButtonDemoPage.clickOnGetCheckedValueButton();
    }

    public void validateTheRadioButtonMsg(String msg){
        Assertions.assertEquals(msg, basicRadioButtonDemoPage.getRadioButtonMsg());
    }
}
