package com.epam.tam.steps;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.AjaxFormSubmitDemoPage;
import org.junit.jupiter.api.Assertions;

public class AjaxFormSubmitDemoStep {

   private final AjaxFormSubmitDemoPage ajaxFormSubmitDemoPage = new AjaxFormSubmitDemoPage(Hooks.getDriver());


   public void writeNameIntoTheTextfield(String name){
       ajaxFormSubmitDemoPage.writeName(name);
   }

   public void writeCommentIntoTheCommentField(String comment){
       ajaxFormSubmitDemoPage.writeComment(comment);
   }

   public void pressSubmitButton(){
       ajaxFormSubmitDemoPage.pressSubmit();
   }

   public void checkSubmitMsg(String msg){
       Assertions.assertEquals(msg, ajaxFormSubmitDemoPage.getSubmitMsg());
   }

   public void validateErrorMsgAppearance(){
       Assertions.assertTrue(ajaxFormSubmitDemoPage.isErrorMsgDisplayed());
   }

   public void clearNameField(){
       ajaxFormSubmitDemoPage.clearNameField();
   }

   public void clearCommentField(){
       ajaxFormSubmitDemoPage.clearCommentField();
   }

   public void isSubmitMsgDisplayed(String msg) {
       Assertions.assertTrue(ajaxFormSubmitDemoPage.getSubmitMsgDisplayed(msg), "Submission message is not displayed!");
   }
}
