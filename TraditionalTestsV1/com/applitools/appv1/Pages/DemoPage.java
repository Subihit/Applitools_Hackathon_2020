package com.applitools.appv1.Pages;

import com.applitools.appv1.maps.DemoMapLaptop;
import com.applitools.appv1.maps.DemoMapMobile;
import com.applitools.appv1.maps.DemoMapTablet;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import utils.BaseTest;
import utils.Viewport;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static utils.BaseTest.browser;

public class DemoPage {


    DemoMapLaptop demoMapLaptop = new DemoMapLaptop(BaseTest.getDriver(browser));
    DemoMapTablet demoMapTablet = new DemoMapTablet(BaseTest.getDriver(browser));
    DemoMapMobile demoMapMobile = new DemoMapMobile(BaseTest.getDriver(browser));

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
            WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(browser), timeoutSec);

            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException tme) {
            tme.getMessage();
        }

    }

    public void verifySearchTextFieldIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.searchTextfield, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.searchTextfield, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsNotDisplayed(demoMapMobile.searchTextfield);
//                click(demoMapTablet.searchTextfield,"Search text");
//                verifyElementIsDisplayed(demoMapMobile.searchTextfield, isDisplayed);
                break;
        }
    }

    public void verifyFiltersIconIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.filterIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.filterIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.filterIcon, isDisplayed);
                break;
        }
    }

    public void verifyQuickLinksListIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                for (WebElement element : demoMapLaptop.quickLinks)
                    verifyElementIsDisplayed(element, isDisplayed);
                break;
            case TABLET:
                for (WebElement element : demoMapTablet.quickLinks)
                    verifyElementIsDisplayed(element, isDisplayed);
                break;
            case MOBILE:
                for (WebElement element : demoMapMobile.quickLinks) {
                    verifyElementIsNotDisplayed(element);
                }
                break;
        }

    }

    public void verifyApplifashionIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.applifashionIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.applifashionIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.applifashionIcon, isDisplayed);
                break;
        }
    }

    public void clickOnSearchIcon(Viewport viewport) {
        waitForElementVisibility(demoMapMobile.searchIcon, 5);
        switch (viewport) {
            case LAPTOP:
                click(demoMapMobile.searchIcon, "Search Icon in Laptop");
                break;

            case TABLET:
                click(demoMapMobile.searchIcon, "Search Icon in Tablet");
                break;

            case MOBILE:
                click(demoMapMobile.searchIcon_, "Search Icon in Mobile");
                break;
        }
    }

    public void verifyWishListIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.wishlistIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.wishlistIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.wishlistIcon, isDisplayed);
                break;
        }
    }

    public void verifyItemsInCartIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.itemsInCartIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.itemsInCartIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.itemsInCartIcon, isDisplayed);
                break;
        }
    }

    public void verifyListViewIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.listViewIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.listViewIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.listViewIcon, isDisplayed);
                break;
        }
    }


}
