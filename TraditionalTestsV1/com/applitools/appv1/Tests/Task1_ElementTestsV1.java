package com.applitools.appv1.Tests;

import com.applitools.appv1.Pages.ApplitoolsV1PageLaptop;
import com.applitools.appv1.Pages.ApplitoolsV1PageMobile;
import com.applitools.appv1.Pages.ApplitoolsV1PageTablet;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.BaseTestModern;
import utils.DemoUtils;
import utils.Viewport;

import static utils.BaseTest.getDriver;


public class Task1_ElementTestsV1 extends BaseTest {

    ApplitoolsV1PageLaptop applitoolsV1PageLaptop ;
    ApplitoolsV1PageTablet applitoolsV1PageTablet ;
    ApplitoolsV1PageMobile applitoolsV1PageMobile ;
    DemoUtils demoUtils = new DemoUtils();

    @BeforeMethod()
    public void instantiatePages(){
        applitoolsV1PageLaptop = new ApplitoolsV1PageLaptop(getDriver());
        applitoolsV1PageTablet = new ApplitoolsV1PageTablet(getDriver());
        applitoolsV1PageMobile = new ApplitoolsV1PageMobile(getDriver());
    }
   
    @Test(dataProvider = "viewPort")
    public void verifyFilterIcon(Viewport viewport) {
        demoUtils.setViewPort(viewport);
        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.verifyFiltersIconIsDisplayed(false);
                break;

            case TABLET:
                applitoolsV1PageTablet.verifyFiltersIconIsDisplayed(true);
                break;

            case MOBILE:
                applitoolsV1PageMobile.verifyFiltersIconIsDisplayed(true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifySearchTextField(Viewport viewport) {
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.verifySearchTextFieldIsDisplayed(true);
                break;

            case TABLET:
                applitoolsV1PageTablet.verifySearchTextFieldIsDisplayed(true);
                break;

            case MOBILE:
                applitoolsV1PageMobile.verifySearchTextFieldIsDisplayed(false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyAllLinksUnderQuickLinksFooter(Viewport viewport) {
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.verifyQuickLinksListIsDisplayed(true);
                break;

            case TABLET:
                applitoolsV1PageTablet.verifyQuickLinksListIsDisplayed(true);
                break;

            case MOBILE:
                applitoolsV1PageMobile.verifyQuickLinksListIsDisplayed(true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyApplifashionIcon(Viewport viewport) {
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.verifyApplifashionIconIsDisplayed(true);
                break;

            case TABLET:
                applitoolsV1PageTablet.verifyApplifashionIconIsDisplayed(true);
                break;

            case MOBILE:
                applitoolsV1PageMobile.verifyApplifashionIconIsDisplayed(true);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyWishListIcon(Viewport viewport) {
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.verifyWishListIconIsDisplayed(true);
                break;

            case TABLET:
                applitoolsV1PageTablet.verifyWishListIconIsDisplayed(false);
                break;

            case MOBILE:
                applitoolsV1PageMobile.verifyWishListIconIsDisplayed(false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyItemsInCartIcon(Viewport viewport) {
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.verifyItemsInCartIconIsDisplayed(true);
                break;

            case TABLET:
                applitoolsV1PageTablet.verifyItemsInCartIconIsDisplayed(true);
                break;

            case MOBILE:
                applitoolsV1PageMobile.verifyItemsInCartIconIsDisplayed(false);
                break;
        }
    }

    @Test(dataProvider = "viewPort")
    public void verifyListViewIcon(Viewport viewport) {
        demoUtils.setViewPort(viewport);

        switch (viewport) {
            case LAPTOP:
                applitoolsV1PageLaptop.verifyListViewIconIsDisplayed(true);
                break;

            case TABLET:
                applitoolsV1PageTablet.verifyListViewIconIsDisplayed(false);
                break;

            case MOBILE:
                applitoolsV1PageMobile.verifyListViewIconIsDisplayed(false);
                break;
        }
    }
}
