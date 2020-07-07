package com.applitools.moderntestsV2.Tests;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.moderntestsV2.Pages.ApplitoolsV1PageLaptop;
import com.applitools.moderntestsV2.Pages.ApplitoolsV1PageMobile;
import com.applitools.moderntestsV2.Pages.ApplitoolsV1PageTablet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTestModern;


public class ModernTests_Task1_ElementTestsV1 extends BaseTestModern {

    ApplitoolsV1PageLaptop applitoolsV1PageLaptop;
    ApplitoolsV1PageTablet applitoolsV1PageTablet;
    ApplitoolsV1PageMobile applitoolsV1PageMobile;

    @BeforeMethod
    public void instantiatePages() {
        applitoolsV1PageLaptop = new ApplitoolsV1PageLaptop(driver);
        applitoolsV1PageTablet = new ApplitoolsV1PageTablet(driver);
        applitoolsV1PageMobile = new ApplitoolsV1PageMobile(driver);
        eyes.open(driver, "Demo App V1", "Task 1", new RectangleSize(800, 600));
    }

    @Test
    public void verifyFilterIcon() {
        applitoolsV1PageLaptop.getFilterIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_Filtericon"));
    }

    @Test
    public void verifySearchTextField() {
        applitoolsV1PageLaptop.clickOnSearchText();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_SearchText"));
    }

    @Test
    public void verifyAllLinksUnderQuickLinksFooter() {
        applitoolsV1PageLaptop.getQuickLinksList().get(0).isDisplayed();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_QuickLinks"));
    }

    @Test
    public void verifyApplifashionIcon() {
        applitoolsV1PageLaptop.getApplifashionIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_AppliFashionIcon"));
    }

    @Test
    public void verifyWishListIcon() {
        applitoolsV1PageLaptop.getWishListIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_Filtericon_WishListIcon"));

    }

    @Test
    public void verifyItemsInCartIcon() {
        applitoolsV1PageLaptop.getItemsInCartIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_Filtericon_ItemsInCartIcon"));
    }

    @Test
    public void verifyListViewIcon() {
        applitoolsV1PageLaptop.getListViewIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_Filtericon_ListView"));
    }
}

