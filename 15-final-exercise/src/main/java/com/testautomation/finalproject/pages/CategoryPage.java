package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.testautomation.finalproject.hooks.Hooks.getDriver;
import static com.testautomation.finalproject.utils.Waiters.waitForTextToBePresent;
import static com.testautomation.finalproject.utils.WebElementHandler.clickButton;
import static com.testautomation.finalproject.utils.WebElementHandler.hoverElement;

public class CategoryPage extends PageObject {

    public CategoryPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".ajax_block_product")
    WebElement productCard;

    @FindBy(css = ".ajax_add_to_cart_button")
    List<WebElement> addToCartButtons;


    public void clickFirstAddToCartButton() {
        waitForTextToBePresent(getDriver(),
                ".ajax_block_product .product-name",
                "Printed Dress");
        hoverElement("Product card", productCard);
        clickButton(getDriver(),"Add to cart", addToCartButtons.get(0));
    }
}
