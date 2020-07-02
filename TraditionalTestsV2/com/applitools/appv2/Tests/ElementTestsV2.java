package com.applitools.appv2.Tests;

import com.applitools.appv2.Pages.DemoPageV2;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.DemoUtils;
import utils.Viewport;

public class ElementTestsV2 extends BaseTest {

    DemoPageV2 demoPageV2 ;
    DemoUtils demoUtilsV2 = new DemoUtils();

    @Test(dataProvider = "viewPort")
    public void verifyFilterIconIsNotDisplayed(Viewport viewport) {
        demoPageV2 = new DemoPageV2(getDriver());
        demoUtilsV2.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                demoPageV2.verifyFiltersIconIsDisplayed(viewport, false);
                break;

            case TABLET:
                demoPageV2.verifyFiltersIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPageV2.verifyFiltersIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifySearchTextFieldIsDisplayed(Viewport viewport) {
        demoPageV2 = new DemoPageV2(getDriver());
        demoUtilsV2.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPageV2.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPageV2.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPageV2.verifySearchTextFieldIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyAllLinksUnderQuickLinksFooterIsDisplayed(Viewport viewport) {
        demoPageV2 = new DemoPageV2(getDriver());
        demoUtilsV2.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPageV2.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPageV2.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPageV2.verifyQuickLinksListIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyApplifashionIconIsDisplayed(Viewport viewport) {
        demoPageV2 = new DemoPageV2(getDriver());
        demoUtilsV2.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPageV2.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPageV2.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPageV2.verifyApplifashionIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyWishListIconIsDisplayed(Viewport viewport) {
        demoPageV2 = new DemoPageV2(getDriver());
        demoUtilsV2.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPageV2.verifyWishListIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPageV2.verifyWishListIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                demoPageV2.verifyWishListIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyItemsInCartIconIsDisplayed(Viewport viewport) {
        demoPageV2 = new DemoPageV2(getDriver());
        demoUtilsV2.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPageV2.verifyItemsInCartIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPageV2.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                demoPageV2.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort", dataProviderClass = BaseTest.class)
    public void verifyListViewIconIsDisplayed(Viewport viewport) {
        demoUtilsV2.setViewPort(viewport);
        demoPageV2 = new DemoPageV2(getDriver());
        switch (viewport) {
            case LAPTOP:
                demoPageV2.verifyListViewIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPageV2.verifyListViewIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                demoPageV2.verifyListViewIconIsDisplayed(viewport, false);
                break;
        }
    }
}
