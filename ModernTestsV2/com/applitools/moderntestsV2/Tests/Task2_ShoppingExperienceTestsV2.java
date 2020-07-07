package com.applitools.moderntestsV2.Tests;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.moderntestsV2.Pages.ApplitoolsV2PageLaptop;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.BaseTestModern;
import utils.DemoUtils;
import utils.Viewport;

public class Task2_ShoppingExperienceTestsV2 extends BaseTestModern {

    ApplitoolsV2PageLaptop applitoolsV2PageLaptop;


    @BeforeMethod
    public void pretest() {
        eyes.open(driver, "Demo App V2", "Task 2", new RectangleSize(800, 600));
    }

    @Test
    public void verifyFilteringBasedOnProductColor() {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());

        applitoolsV2PageLaptop.clickOnFilterIcon();
        applitoolsV2PageLaptop.clickOnColorCheckboxFilter(1);
        applitoolsV2PageLaptop.clickOnFilterButton();

        eyes.check(Target.window().fully().withName("Shopping Experience Test"));
    }
}
