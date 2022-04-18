package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".cart_description .product-name")
    WebElement productName;

    @FindBy(css = ".cart_quantity_input")
    WebElement productQuantity;


    public String getProductName() {
        return productName.getText();
    }

    public String getProductQuantity() {
        return productQuantity.getAttribute("value");
    }
}
