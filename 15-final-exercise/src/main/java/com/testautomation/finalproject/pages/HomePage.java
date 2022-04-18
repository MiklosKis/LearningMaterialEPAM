package com.testautomation.finalproject.pages;

import com.testautomation.finalproject.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.testautomation.finalproject.hooks.Hooks.getDriver;
import static com.testautomation.finalproject.utils.WebElementHandler.*;

public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final static Logger LOGGER =
            Logger.getLogger(Logger.class.getName());


    @FindBy(css = ".login")
    WebElement signInButton;

    @FindBy(css = "#contact-link")
    WebElement contactUsButton;

    @FindBy(css = ".sf-menu .sf-with-ul")
    List<WebElement> mainMenu;

    @FindBy(css = ".sf-menu .submenu-container li")
    List<WebElement> casualDress;

    @FindBy(css = "#search_query_top")
    WebElement searchBar;

    @FindBy(css = ".button-search")
    WebElement searchButton;


    public void clickOnCasualDresses() {
        try {
            hoverElement("Second menu item - Dresses", mainMenu.get(3));
            clickButton(getDriver(), "Dresses submenu - Casual Dresses", casualDress.get(9));
        } catch (IndexOutOfBoundsException e) {
            LOGGER.log(Level.SEVERE, "Index Out of Bounds error!");
        }
    }

    public void clickOnSignInButton() {
        clickButton(getDriver(),"Sign in", signInButton);
    }

    public void clickOnContactUsButton() {
        clickButton(getDriver(),"Contact us", contactUsButton);
    }

    public void typeIntoSearchBar(String searchProduct) {
        sendTextToField(searchProduct, "Searchbar", searchBar);
    }

    public void clickSearchButton() {
        clickButton(getDriver(),"Search", searchButton);
    }
}
