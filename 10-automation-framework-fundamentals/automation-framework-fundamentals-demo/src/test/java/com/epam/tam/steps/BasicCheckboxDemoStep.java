package com.epam.tam.steps;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.BasicCheckboxDemoPage;
import org.junit.jupiter.api.Assertions;

public class BasicCheckboxDemoStep {

    private final BasicCheckboxDemoPage basicCheckboxDemoPage = new BasicCheckboxDemoPage(Hooks.getDriver());

    public void checkTheAgeCheckbox(){
        basicCheckboxDemoPage.checkAgeCheckbox();
    }

    public void isAgeCheckboxChecked(){
        Assertions.assertTrue(basicCheckboxDemoPage.isAgeChecboxChecked());
    }

    public void checkTheAgeMsg(String msg){
        Assertions.assertEquals(msg, basicCheckboxDemoPage.getAgeCheckboxMsg());
    }
}
