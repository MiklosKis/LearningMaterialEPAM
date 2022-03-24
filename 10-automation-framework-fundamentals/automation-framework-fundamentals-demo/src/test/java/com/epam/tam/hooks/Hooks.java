package com.epam.tam.hooks;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();

    }

    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeEach
    public void start() {
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }


}
