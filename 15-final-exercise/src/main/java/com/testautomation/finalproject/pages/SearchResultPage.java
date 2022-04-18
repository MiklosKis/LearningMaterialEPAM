package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.testautomation.finalproject.hooks.Hooks.getDriver;
import static com.testautomation.finalproject.utils.WebElementHandler.clickButton;
import static com.testautomation.finalproject.utils.WebElementHandler.hoverElement;


public class SearchResultPage extends PageObject {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".right-block .product-name")
    WebElement searchedProductName;

    @FindBy(css = ".ajax_block_product:first-of-type")
    WebElement firstSearchedItem;

    @FindBy(css = ".ajax_block_product:first-of-type .lnk_view")
    WebElement seeMoreButton;


    public String getSearchedProductName() {
        return searchedProductName.getText().toLowerCase();
    }

    public void clickSeeMoreButton() {
        hoverElement("First search result item", firstSearchedItem);
        clickButton(getDriver(),"More", seeMoreButton);
    }
}
