package com.epam.tam.steps;

import com.epam.tam.hooks.Hooks;
import com.epam.tam.pages.BasicSelectDropDownDemoPage;
import org.junit.jupiter.api.Assertions;

public class BasicSelectDropDownDemoStep {

    private final BasicSelectDropDownDemoPage basicSelectDropDownDemoPage = new BasicSelectDropDownDemoPage(Hooks.getDriver());

    public void selectDayFromTheDropDown(String day) {
        basicSelectDropDownDemoPage.selectDay(day);
    }

    public void validateTheSelectedDay(String day) {
        Assertions.assertEquals(day, basicSelectDropDownDemoPage.getSelectedDay());
    }

    public void validateTheSelectedDayMsg(String msg) {
        Assertions.assertEquals(msg, basicSelectDropDownDemoPage.getSelectedDayMsg());
    }
}
