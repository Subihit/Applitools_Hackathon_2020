package com.applitool.Tests;

import com.applitool.Pages.DemoPage;
import org.testng.annotations.Test;

public class ElementTests extends BaseTest {

    DemoPage demoPage = new DemoPage(getDriver());

    @Test
    public void verifyFilterIconIsNotDisplayed() {
        demoPage.verifyFiltersTextDisplayed(false);
    }

    @Test
    public void verifySearchTextIsDisplayed() {
        demoPage.verifySearchTextFieldIsDisplayed(true);
    }


}
