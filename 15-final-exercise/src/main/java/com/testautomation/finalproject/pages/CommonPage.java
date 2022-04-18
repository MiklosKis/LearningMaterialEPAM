package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.testautomation.finalproject.hooks.Hooks.getDriver;
import static com.testautomation.finalproject.utils.Waiters.waitForTextToBePresent;
import static com.testautomation.finalproject.utils.WebElementHandler.clickButton;

public class CommonPage extends PageObject {

    public CommonPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".layer_cart_product h2")
    WebElement popupSuccessMessage;

    @FindBy(css = "#layer_cart_product_title")
    WebElement popupProductName;

    @FindBy(css = "#layer_cart_product_quantity")
    WebElement popupProductQuantity;

    @FindBy(css = ".button-container .button-medium")
    WebElement proceedToCheckoutButton;


    public String getPopupSuccessMessage() {
        waitForTextToBePresent(getDriver(),
                ".layer_cart_product h2",
                "Product successfully added to your shopping cart");
        return popupSuccessMessage.getText();
    }

    public String getPopupProductName() {
        return popupProductName.getText();
    }

    public String getPopupProductQuantity() {
        return popupProductQuantity.getText();
    }

    public void clickProceedToCheckoutButton() {
        clickButton(getDriver(),"Proceed to checkout", proceedToCheckoutButton);
    }
}
