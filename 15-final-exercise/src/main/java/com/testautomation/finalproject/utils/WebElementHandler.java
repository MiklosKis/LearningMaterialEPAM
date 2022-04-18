package com.testautomation.finalproject.utils;

import com.testautomation.finalproject.hooks.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.logging.Logger;

public class WebElementHandler {
    private final static Logger LOGGER =
            Logger.getLogger(Logger.class.getName());

    private WebElementHandler() {
        // prevents instantiation
    }

    public static void hoverElement(String elementName, WebElement element) {
        LOGGER.info("Hovering on '" + elementName + "'.git push");
        Actions actions = new Actions(Hooks.getDriver());
        actions.moveToElement(element).perform();
    }

    public static void clickButton(WebDriver driver, String elementName, WebElement element) {
        LOGGER.info("Clicking '" + elementName + "' button on '" + driver.getTitle() + "' page.");
        element.click();
    }

    public static void sendTextToField(String text, String elementName, WebElement element) {
        LOGGER.info("Sending '" + text + "' to '" + elementName + "' field.");
        element.sendKeys(text);
    }
}
