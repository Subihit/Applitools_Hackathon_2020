package com.applitools.moderntestsV2.Tests;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.moderntestsV2.Pages.ApplitoolsV1PageLaptop;
import com.applitools.moderntestsV2.Pages.ApplitoolsV2PageLaptop;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTestModern;

public class Task3_ProductDetailsTestsV2 extends BaseTestModern {

    ApplitoolsV2PageLaptop applitoolsV2PageLaptop;

    @BeforeMethod
    public void pretest(){
        eyes.open(driver, "Demo App V2", "Task 3", new RectangleSize(800, 600));
    }

    @Test
    public void verifyProductDetails() {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());

        applitoolsV2PageLaptop.clickOnFilterIcon();
        applitoolsV2PageLaptop.clickOnColorCheckboxFilter(1);
        applitoolsV2PageLaptop.clickOnFilterButton();
        applitoolsV2PageLaptop.clickOnProduct(1);

        eyes.check(Target.window().fully().withName("Product Details Test"));
    }
}
