package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageObject {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#our_price_display")
    WebElement detailProductPrice;

    @FindBy(css = ".pb-center-column h1")
    WebElement detailProductName;


    public String getDetailProductPrice() {
        return detailProductPrice.getText();
    }

    public String getDetailProductName() {
        return detailProductName.getText();
    }
}
