package com.applitools.appv2.Pages;

import com.applitools.appv2.maps.DemoMapLaptopV2;
import com.applitools.appv2.maps.DemoMapMobileV2;
import com.applitools.appv2.maps.DemoMapTabletV2;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import utils.Viewport;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static utils.BaseTest.browser;
import static utils.BaseTest.getDriver;

public class DemoPageV2 {

    DemoMapLaptopV2 demoMapLaptopV2 = new DemoMapLaptopV2(getDriver(browser));
    DemoMapTabletV2 demoMapTabletV2 = new DemoMapTabletV2(getDriver(browser));
    DemoMapMobileV2 demoMapMobileV2 = new DemoMapMobileV2(getDriver(browser));

    public void verifyElementIsDisplayed(WebElement element, boolean isDisplayed) {
        if (isDisplayed) {
            System.out.println("Verify element is displayed");
            try {
                waitForElementVisibility(element, 5);
                assertTrue(element.isDisplayed());
            } catch (NoSuchElementException nse) {
                Assert.fail("Element Not Found");
            }
        } else {
            System.out.println("Verify element is not displayed");
            try {
                assertFalse(element.isDisplayed());
            } catch (NoSuchElementException nse) {
                System.out.println(nse.toString());
            }
        }
    }

    public void verifyElementIsNotDisplayed(WebElement element) {
        try {
            element.click();
            Assert.fail("Element is present");
        } catch (ElementNotInteractableException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public void click(WebElement element, @Optional("Element") String elementName) {
        System.out.println("Click on " + elementName);
        element.click();
    }

    public void waitForElementVisibility(final WebElement element, int timeoutSec) {
        System.out.println("Wait for Element");

//        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver2())
//                .withTimeout(timeoutSec, TimeUnit.SECONDS)
//                .pollingEvery(1,TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);

        try {
            WebDriverWait wait = new WebDriverWait(getDriver(browser), timeoutSec);

            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException tme) {
            tme.getMessage();
        }

    }

    public void verifySearchTextFieldIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptopV2.searchTextfield, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTabletV2.searchTextfield, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsNotDisplayed(demoMapMobileV2.searchTextfield);
//                click(demoMapTabletV2.searchTextfield,"Search text");
//                verifyElementIsDisplayed(demoMapMobileV2.searchTextfield, isDisplayed);
                break;
        }
    }

    public void verifyFiltersIconIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptopV2.filterIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTabletV2.filterIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobileV2.filterIcon, isDisplayed);
                break;
        }
    }

    public void verifyQuickLinksListIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                for (WebElement element : demoMapLaptopV2.quickLinks)
                    verifyElementIsDisplayed(element, isDisplayed);
                break;
            case TABLET:
                for (WebElement element : demoMapTabletV2.quickLinks)
                    verifyElementIsDisplayed(element, isDisplayed);
                break;
            case MOBILE:
                for (WebElement element : demoMapMobileV2.quickLinks) {
                    verifyElementIsNotDisplayed(element);
                }
                break;
        }

    }

    public void verifyApplifashionIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptopV2.applifashionIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTabletV2.applifashionIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobileV2.applifashionIcon, isDisplayed);
                break;
        }
    }

    public void clickOnSearchIcon(Viewport viewport) {
        waitForElementVisibility(demoMapMobileV2.searchIcon, 5);
        switch (viewport) {
            case LAPTOP:
                click(demoMapMobileV2.searchIcon, "Search Icon in Laptop");
                break;

            case TABLET:
                click(demoMapMobileV2.searchIcon, "Search Icon in Tablet");
                break;

            case MOBILE:
                click(demoMapMobileV2.searchIcon_, "Search Icon in Mobile");
                break;
        }
    }

    public void verifyWishListIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptopV2.wishlistIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTabletV2.wishlistIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobileV2.wishlistIcon, isDisplayed);
                break;
        }
    }

    public void verifyItemsInCartIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptopV2.itemsInCartIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTabletV2.itemsInCartIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobileV2.itemsInCartIcon, isDisplayed);
                break;
        }
    }

    public void verifyListViewIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptopV2.listViewIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTabletV2.listViewIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobileV2.listViewIcon, isDisplayed);
                break;
        }
    }


}
