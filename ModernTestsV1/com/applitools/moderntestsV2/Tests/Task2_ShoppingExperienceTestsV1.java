package com.applitools.moderntestsV2.Tests;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.moderntestsV2.Pages.ApplitoolsV1PageLaptop;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.BaseTestModern;
import utils.DemoUtils;
import utils.Viewport;

public class Task2_ShoppingExperienceTestsV1 extends BaseTestModern {

    ApplitoolsV1PageLaptop applitoolsV1PageLaptop;

    @BeforeMethod
    public void pretest(){
        eyes.open(driver, "Demo App V1", "Task 2", new RectangleSize(800, 600));
    }

    @Test
    public void verifyFilteringBasedOnProductColor() {
        applitoolsV1PageLaptop = new ApplitoolsV1PageLaptop(getDriver());

        applitoolsV1PageLaptop.clickOnFilterIcon();
        applitoolsV1PageLaptop.clickOnColorCheckboxFilter(1);
        applitoolsV1PageLaptop.clickOnFilterButton();

        eyes.check(Target.window().fully().withName("Shopping Experience Test"));
    }
}
