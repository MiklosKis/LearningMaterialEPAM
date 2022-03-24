package com.epam.tam.tests;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.steps.*;
import org.junit.jupiter.api.Test;


public class AdvancedWebdriverTest extends Hooks {

    CommonStep commonStep = new CommonStep();
    AjaxFormSubmitDemoStep ajaxFormSubmitDemoStep = new AjaxFormSubmitDemoStep();
    BasicCheckboxDemoStep basicCheckboxDemoStep = new BasicCheckboxDemoStep();
    BasicRadioButtonDemoStep basicRadioButtonDemoStep = new BasicRadioButtonDemoStep();
    BasicSelectDropDownDemoStep basicSelectDropDownDemoStep = new BasicSelectDropDownDemoStep();

    @Test
    public void testExercise1() {
        commonStep.openPage("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        basicCheckboxDemoStep.checkTheAgeCheckbox();
        basicCheckboxDemoStep.isAgeCheckboxChecked();
        basicCheckboxDemoStep.checkTheAgeMsg("Success - Check box is checked");
    }

    @Test
    public void testExercise2() {
        commonStep.openPage("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        basicRadioButtonDemoStep.clickOnMaleRadioButton();
        basicRadioButtonDemoStep.checkTheMaleRadioButtonIsSelected();
        basicRadioButtonDemoStep.clickOnGetCheckedValueButton();
        basicRadioButtonDemoStep.validateTheRadioButtonMsg("Radio button 'Male' is checked");
    }

    @Test
    public void testExercise3() {
        commonStep.openPage("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        basicSelectDropDownDemoStep.selectDayFromTheDropDown("Thursday");
        basicSelectDropDownDemoStep.validateTheSelectedDay("Thursday");
        basicSelectDropDownDemoStep.validateTheSelectedDayMsg("Day selected :- Thursday");
    }

    @Test
    public void testExercise4() {
        commonStep.openPage("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        ajaxFormSubmitDemoStep.writeNameIntoTheTextfield("Tester");
        ajaxFormSubmitDemoStep.pressSubmitButton();
        ajaxFormSubmitDemoStep.isSubmitMsgDisplayed("Form submited Successfully!");
    }

}
