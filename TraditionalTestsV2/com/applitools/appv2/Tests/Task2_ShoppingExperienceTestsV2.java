package com.applitools.appv2.Tests;

import com.applitools.appv1.Pages.ApplitoolsV1PageLaptop;
import com.applitools.appv1.Pages.ApplitoolsV1PageMobile;
import com.applitools.appv1.Pages.ApplitoolsV1PageTablet;
import org.testng.annotations.Test;
import utils.BaseTestTraditional;
import utils.DemoUtils;
import utils.Viewport;

public class Task2_ShoppingExperienceTestsV2 extends BaseTestTraditional {

    ApplitoolsV1PageLaptop applitoolsV1PageLaptop;
    ApplitoolsV1PageTablet applitoolsV1PageTablet;
    ApplitoolsV1PageMobile applitoolsV1PageMobile;
    DemoUtils demoUtils = new DemoUtils();

    @Test(dataProvider = "viewPort")
    public void verifyFilteringBasedOnProductColor(Viewport viewport) {
        applitoolsV1PageLaptop = new ApplitoolsV1PageLaptop(getDriver());
        applitoolsV1PageTablet = new ApplitoolsV1PageTablet(getDriver());
        applitoolsV1PageMobile = new ApplitoolsV1PageMobile(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.clickOnColorCheckboxFilter(1);
                applitoolsV1PageLaptop.clickOnFilterButton();
                applitoolsV1PageLaptop.verifyNumberOfProductsThatIsDisplayed(viewport, 2);
                break;

            case TABLET:
                applitoolsV1PageTablet.clickOnFilterIcon();
                applitoolsV1PageTablet.clickOnColorCheckboxFilter(1);
                applitoolsV1PageTablet.clickOnFilterButton();
                applitoolsV1PageTablet.verifyNumberOfProductsThatIsDisplayed(viewport, 2);
                break;

            case MOBILE:
                applitoolsV1PageMobile.clickOnFilterIcon();
                applitoolsV1PageMobile.clickOnColorCheckboxFilter(1);
                applitoolsV1PageMobile.clickOnFilterButton();
                applitoolsV1PageMobile.verifyNumberOfProductsThatIsDisplayed(viewport, 2);
                break;
        }
    }
}
