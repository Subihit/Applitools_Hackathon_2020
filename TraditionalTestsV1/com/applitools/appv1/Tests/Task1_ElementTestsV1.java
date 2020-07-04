package com.applitools.appv1.Tests;

import com.applitools.appv1.Pages.ApplitoolsV1Page;

import org.testng.annotations.Test;
import utils.*;

public class Task1_ElementTestsV1 extends BaseTest {

    ApplitoolsV1Page applitoolsV1Page;
    DemoUtils demoUtils = new DemoUtils();

    @Test(dataProvider = "viewPort")
    public void verifyFilterIcon(Viewport viewport) {
        applitoolsV1Page = new ApplitoolsV1Page(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1Page.verifyFiltersIconIsDisplayed(viewport, false);
                break;

            case TABLET:
                applitoolsV1Page.verifyFiltersIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV1Page.verifyFiltersIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifySearchTextField(Viewport viewport) {
        applitoolsV1Page = new ApplitoolsV1Page(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1Page.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV1Page.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV1Page.verifySearchTextFieldIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyAllLinksUnderQuickLinksFooter(Viewport viewport) {
        applitoolsV1Page = new ApplitoolsV1Page(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1Page.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV1Page.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV1Page.verifyQuickLinksListIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyApplifashionIcon(Viewport viewport) {
        applitoolsV1Page = new ApplitoolsV1Page(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1Page.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV1Page.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV1Page.verifyApplifashionIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyWishListIcon(Viewport viewport) {
        applitoolsV1Page = new ApplitoolsV1Page(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1Page.verifyWishListIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV1Page.verifyWishListIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV1Page.verifyWishListIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyItemsInCartIcon(Viewport viewport) {
        applitoolsV1Page = new ApplitoolsV1Page(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1Page.verifyItemsInCartIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV1Page.verifyItemsInCartIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                applitoolsV1Page.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyListViewIcon(Viewport viewport) {
        applitoolsV1Page = new ApplitoolsV1Page(getDriver());
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1Page.verifyListViewIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                applitoolsV1Page.verifyListViewIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                applitoolsV1Page.verifyListViewIconIsDisplayed(viewport, false);
                break;
        }
    }
}
