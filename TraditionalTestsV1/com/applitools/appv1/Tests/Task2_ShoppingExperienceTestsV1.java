package com.applitools.appv1.Tests;

import com.applitools.appv1.Pages.ApplitoolsV1PageLaptop;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.DemoUtils;
import utils.Viewport;

public class Task2_ShoppingExperienceTestsV1 extends BaseTest {

    ApplitoolsV1PageLaptop applitoolsV1PageLaptop;
    DemoUtils demoUtils = new DemoUtils();

    @Test(dataProvider = "viewPort")
    public void verifyFilterIcon(Viewport viewport) {
        applitoolsV1PageLaptop = new ApplitoolsV1PageLaptop(getDriver());
        demoUtils.setViewPort(viewport);

//        switch (viewport) {
//            case LAPTOP:
//                applitoolsV1PageLaptop.clickOnColorCheckboxFilter(viewport,1);
//                applitoolsV1PageLaptop.clickOnFilterButton(viewport);
//                applitoolsV1PageLaptop.verifyNumberOfProductsThatIsDisplayed(viewport, 2);
//                break;
//
//            case TABLET:
//                applitoolsV1PageLaptop.clickOnFilterIcon();
//                applitoolsV1PageLaptop.clickOnColorCheckboxFilter(viewport,1);
//                applitoolsV1PageLaptop.clickOnFilterButton(viewport);
//                applitoolsV1PageLaptop.verifyNumberOfProductsThatIsDisplayed(viewport, 2);
//                break;
//
//            case MOBILE:
//                applitoolsV1PageLaptop.clickOnFilterIcon();
//                applitoolsV1PageLaptop.clickOnColorCheckboxFilter(viewport,1);
//                applitoolsV1PageLaptop.clickOnFilterButton(viewport);
//                applitoolsV1PageLaptop.verifyNumberOfProductsThatIsDisplayed(viewport, 2);
//                break;
//        }
    }
}
