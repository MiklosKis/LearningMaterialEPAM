package com.epam.tam.tests;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.steps.AjaxFormSubmitDemoStep;
import org.junit.jupiter.api.Test;

public class BasicWebdriverTest extends Hooks{

    AjaxFormSubmitDemoStep ajaxFormSubmitDemoStep = new AjaxFormSubmitDemoStep();

    @Test
    public void testExercise1() {
        ajaxFormSubmitDemoStep.writeNameIntoTheTextfield("Tester");
        ajaxFormSubmitDemoStep.writeCommentIntoTheCommentField("Hello World!");
        ajaxFormSubmitDemoStep.pressSubmitButton();
        ajaxFormSubmitDemoStep.isSubmitMsgDisplayed("Form submited Successfully!");
    }

    @Test
    public void testExercise2( ) {
        ajaxFormSubmitDemoStep.clearNameField();
        ajaxFormSubmitDemoStep.clearCommentField();
        ajaxFormSubmitDemoStep.pressSubmitButton();
        ajaxFormSubmitDemoStep.validateErrorMsgAppearance();
    }
}
