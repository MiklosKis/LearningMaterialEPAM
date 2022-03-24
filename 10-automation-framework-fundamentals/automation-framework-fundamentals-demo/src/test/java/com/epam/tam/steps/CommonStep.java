package com.epam.tam.steps;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.CommonPage;

public class CommonStep {

    CommonPage commonPage = new CommonPage(Hooks.getDriver());

    public void openPage(String url) {
        commonPage.getPage(url);
    }
}
