package com.testautomation.finalproject.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class Waiters {

    private final static Logger LOGGER =
            Logger.getLogger(Logger.class.getName());

    private Waiters() {
        //prevents instantiation
    }

    public static void waitForTextToBePresent(WebDriver driver, String element, String text) {
        LOGGER.info("Waiting for '" + text + "' text to be present.");
        WebDriverWait waiter = new WebDriverWait(driver, 10);
        waiter.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(element), text));
    }
}
