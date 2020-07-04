package com.applitools.appv2.Tests;

import com.applitools.appv2.Pages.ApplitoolsV2Page;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.DemoUtils;
import utils.Viewport;

public class Task1_ElementTestsV2 extends BaseTest {

    ApplitoolsV2Page applitoolsV2Page;
    DemoUtils demoUtilsV2 = new DemoUtils();

    @Test(dataProvider = "viewPort")
    public void verifyFilterIconIsNotDisplayed(Viewport viewport) {
        applitoolsV2Page = new ApplitoolsV2Page(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2Page.verifyFiltersIconIsDisplayed(viewport, false);
                break;

            case TABLET:
                applitoolsV2Page.verifyFiltersIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2Page.verifyFiltersIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifySearchTextFieldIsDisplayed(Viewport viewport) {
        applitoolsV2Page = new ApplitoolsV2Page(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2Page.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2Page.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2Page.verifySearchTextFieldIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyAllLinksUnderQuickLinksFooterIsDisplayed(Viewport viewport) {
        applitoolsV2Page = new ApplitoolsV2Page(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2Page.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2Page.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2Page.verifyQuickLinksListIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyApplifashionIconIsDisplayed(Viewport viewport) {
        applitoolsV2Page = new ApplitoolsV2Page(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2Page.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2Page.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV2Page.verifyApplifashionIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyWishListIconIsDisplayed(Viewport viewport) {
        applitoolsV2Page = new ApplitoolsV2Page(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2Page.verifyWishListIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2Page.verifyWishListIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV2Page.verifyWishListIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyItemsInCartIconIsDisplayed(Viewport viewport) {
        applitoolsV2Page = new ApplitoolsV2Page(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV2Page.verifyItemsInCartIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2Page.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV2Page.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort", dataProviderClass = BaseTest.class)
    public void verifyListViewIconIsDisplayed(Viewport viewport) {
        demoUtilsV2.setViewPort(viewport);
        applitoolsV2Page = new ApplitoolsV2Page(getDriver());

        switch (viewport) {
            case LAPTOP:
                applitoolsV2Page.verifyListViewIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV2Page.verifyListViewIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV2Page.verifyListViewIconIsDisplayed(viewport, false);
                break;
        }
    }
}
