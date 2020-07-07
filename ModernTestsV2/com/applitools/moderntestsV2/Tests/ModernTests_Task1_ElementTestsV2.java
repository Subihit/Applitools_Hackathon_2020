package com.applitools.moderntestsV2.Tests;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.moderntestsV2.Pages.ApplitoolsV2PageLaptop;
import com.applitools.moderntestsV2.Pages.ApplitoolsV2PageMobile;
import com.applitools.moderntestsV2.Pages.ApplitoolsV2PageTablet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTestModern;


public class ModernTests_Task1_ElementTestsV2 extends BaseTestModern {

    ApplitoolsV2PageLaptop applitoolsV2PageLaptop;
    ApplitoolsV2PageTablet applitoolsV1PageTablet;
    ApplitoolsV2PageMobile applitoolsV1PageMobile;

    @BeforeMethod
    public void instantiatePages() {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(driver);
        applitoolsV1PageTablet = new ApplitoolsV2PageTablet(driver);
        applitoolsV1PageMobile = new ApplitoolsV2PageMobile(driver);
        eyes.open(driver, "Demo App V2", "Task 1", new RectangleSize(800, 600));
    }

    @Test
    public void verifyFilterIcon() {
        applitoolsV2PageLaptop.getFilterIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_FilterIcon"));
    }

    @Test
    public void verifySearchTextField() {
        applitoolsV2PageLaptop.clickOnSearchText();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_SearchText"));
    }

    @Test
    public void verifyAllLinksUnderQuickLinksFooter() {
        applitoolsV2PageLaptop.getQuickLinksList().get(0).isDisplayed();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_QuickLinks"));
    }

    @Test
    public void verifyApplifashionIcon() {
        applitoolsV2PageLaptop.getApplifashionIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_AppliFashionIcon"));
    }

    @Test
    public void verifyWishListIcon() {
        applitoolsV2PageLaptop.getWishListIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_WisjListIcon"));
    }

    @Test
    public void verifyItemsInCartIcon() {
        applitoolsV2PageLaptop.getItemsInCartIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_ItemsInCartIcon"));
    }

    @Test
    public void verifyListViewIcon() {
        applitoolsV2PageLaptop.getListViewIcon();
        eyes.check(Target.window().fully().withName("Cross-Device Elements Test_ListViewIcon"));
    }
}

