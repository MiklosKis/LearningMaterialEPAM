package com.epam.tam.pages;

import com.epam.tam.utils.PageObject;
import org.openqa.selenium.WebDriver;

public class CommonPage extends PageObject {

    WebDriver driver;

    public CommonPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void getPage(String url) {
        driver.get(url);
    }
}
