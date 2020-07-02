package com.applitools.appv1.Tests;

import com.applitools.appv1.Pages.DemoPage;

import org.testng.annotations.Test;
import utils.*;

public class ElementTests extends BaseTest {

    DemoPage demoPage;
    DemoUtils demoUtils = new DemoUtils();

    @Test(dataProvider = "viewPort")
    public void verifyFilterIcon(Viewport viewport) {
        demoPage = new DemoPage(getDriver());

        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPage.verifyFiltersIconIsDisplayed(viewport, false);
                break;

            case TABLET:
                demoPage.verifyFiltersIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPage.verifyFiltersIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifySearchTextField(Viewport viewport) {
        demoPage = new DemoPage(getDriver());

        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPage.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPage.verifySearchTextFieldIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPage.verifySearchTextFieldIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyAllLinksUnderQuickLinksFooter(Viewport viewport) {
        demoPage = new DemoPage(getDriver());

        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPage.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPage.verifyQuickLinksListIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPage.verifyQuickLinksListIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyApplifashionIcon(Viewport viewport) {
        demoPage = new DemoPage(getDriver());

        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPage.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPage.verifyApplifashionIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPage.verifyApplifashionIconIsDisplayed(viewport, true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyWishListIcon(Viewport viewport) {
        demoPage = new DemoPage(getDriver());

        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPage.verifyWishListIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPage.verifyWishListIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                demoPage.verifyWishListIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyItemsInCartIcon(Viewport viewport) {
        demoPage = new DemoPage(getDriver());

        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPage.verifyItemsInCartIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPage.verifyItemsInCartIconIsDisplayed(viewport, true);
                break;

            case MOBILE:
                demoPage.verifyItemsInCartIconIsDisplayed(viewport, false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyListViewIcon(Viewport viewport) {
        demoPage = new DemoPage(getDriver());

        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                demoPage.verifyListViewIconIsDisplayed(viewport, true);
                break;

            case TABLET:
                demoPage.verifyListViewIconIsDisplayed(viewport, false);
                break;

            case MOBILE:
                demoPage.verifyListViewIconIsDisplayed(viewport, false);
                break;
        }
    }
}
