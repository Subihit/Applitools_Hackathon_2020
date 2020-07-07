package com.applitools.moderntestsV2.Tests;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.moderntestsV2.Pages.ApplitoolsV1PageLaptop;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTestModern;

public class Task3_ProductDetailsTestsV1 extends BaseTestModern {

    ApplitoolsV1PageLaptop applitoolsV1PageLaptop;

    @BeforeMethod
    public void pretest(){
        eyes.open(driver, "Demo App V1", "Task 3", new RectangleSize(800, 600));
    }

    @Test
    public void verifyProductDetails() {
        applitoolsV1PageLaptop = new ApplitoolsV1PageLaptop(getDriver());

        applitoolsV1PageLaptop.clickOnFilterIcon();
        applitoolsV1PageLaptop.clickOnColorCheckboxFilter(1);
        applitoolsV1PageLaptop.clickOnFilterButton();
        applitoolsV1PageLaptop.clickOnProduct(1);

        eyes.check(Target.window().fully().withName("Product Details Test"));
    }
}
