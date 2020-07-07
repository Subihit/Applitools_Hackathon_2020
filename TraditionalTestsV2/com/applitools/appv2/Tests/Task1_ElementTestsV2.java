package com.applitools.appv2.Tests;

import com.applitools.appv2.Pages.ApplitoolsV2PageLaptop;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.BaseTestTraditional;
import utils.DemoUtils;
import utils.Viewport;

public class Task1_ElementTestsV2 extends BaseTestTraditional {

    ApplitoolsV2PageLaptop applitoolsV2PageLaptop;
    DemoUtils demoUtilsV2 = new DemoUtils();

    @Test(dataProvider = "viewPort")
    public void verifyFilterIconIsNotDisplayed(Viewport viewport) {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2PageLaptop.verifyFiltersIconIsDisplayed(viewport, false);
                break;

            case TABLET:
                applitoolsV2PageLaptop.verifyFiltersIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2PageLaptop.verifyFiltersIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifySearchTextFieldIsDisplayed(Viewport viewport) {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2PageLaptop.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2PageLaptop.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2PageLaptop.verifySearchTextFieldIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyAllLinksUnderQuickLinksFooterIsDisplayed(Viewport viewport) {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2PageLaptop.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2PageLaptop.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2PageLaptop.verifyQuickLinksListIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyApplifashionIconIsDisplayed(Viewport viewport) {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2PageLaptop.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2PageLaptop.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2PageLaptop.verifyApplifashionIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyWishListIconIsDisplayed(Viewport viewport) {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2PageLaptop.verifyWishListIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2PageLaptop.verifyWishListIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV2PageLaptop.verifyWishListIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyItemsInCartIconIsDisplayed(Viewport viewport) {
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2PageLaptop.verifyItemsInCartIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2PageLaptop.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV2PageLaptop.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyListViewIconIsDisplayed(Viewport viewport) {
        demoUtilsV2.setViewPort(viewport);
        applitoolsV2PageLaptop = new ApplitoolsV2PageLaptop(getDriver());

        switch (viewport) {
            case LAPTOP:
                applitoolsV2PageLaptop.verifyListViewIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2PageLaptop.verifyListViewIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV2PageLaptop.verifyListViewIconIsDisplayed(viewport, false);
                break;
        }
    }
}
