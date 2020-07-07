package com.applitools.appv1.Tests;

import com.applitools.appv1.Pages.ApplitoolsV1PageLaptop;
import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.BaseTestModern;
import utils.DemoUtils;
import utils.Viewport;

public class Task2_ShoppingExperienceTestsV1 extends BaseTestModern {

    ApplitoolsV1PageLaptop applitoolsV1PageLaptop;

    @Test
    public void verifyFilterIcon() {
        applitoolsV1PageLaptop = new ApplitoolsV1PageLaptop(getDriver());

        applitoolsV1PageLaptop.clickOnColorCheckboxFilter(1);
        applitoolsV1PageLaptop.clickOnFilterButton();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_FilterIcon"));
    }
}

