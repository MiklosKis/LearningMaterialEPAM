package com.epam.tam.stepdefs;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.CommonPage;
import io.cucumber.java.en.Given;


public class CommonSteps {
    CommonPage commonPage = new CommonPage(Hooks.getDriver());

    @Given("^I open the (.+) page$")
    public void iOpenThePage(String url) {
        commonPage.openPage(url);
    }
}
