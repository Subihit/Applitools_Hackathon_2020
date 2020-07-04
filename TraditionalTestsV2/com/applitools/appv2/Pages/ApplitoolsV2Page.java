package com.applitools.appv2.Pages;

import com.applitools.appv2.maps.ApplitoolsV2MapLaptop;
import com.applitools.appv2.maps.ApplitoolsV2MapMobile;
import com.applitools.appv2.maps.ApplitoolsV2MapTablet;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Viewport;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static utils.BaseTest.setLocator;

public class ApplitoolsV2Page {
    WebDriver driver;
    ApplitoolsV2MapLaptop demoMapLaptop;
    ApplitoolsV2MapTablet demoMapTablet;
    ApplitoolsV2MapMobile demoMapMobile;

    public ApplitoolsV2Page(WebDriver driver) {
        this.driver = driver;
        demoMapLaptop = new ApplitoolsV2MapLaptop(driver);
        demoMapTablet = new ApplitoolsV2MapTablet(driver);
        demoMapMobile = new ApplitoolsV2MapMobile(driver);
    }

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


    public void click(WebElement element, String elementName) {
        System.out.println("Click on " + elementName);
        element.click();
    }

    public void waitForElementVisibility(final WebElement element, int timeoutSec) {
        System.out.println("Wait for Element");

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeoutSec);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException tme) {
            tme.getMessage();
        }

    }

    public void verifySearchTextFieldIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.searchTextfield, isDisplayed);
                setLocator(demoMapLaptop.searchTextfield.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.searchTextfield, isDisplayed);
                setLocator(demoMapTablet.searchTextfield.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsNotDisplayed(demoMapMobile.searchTextfield);
                setLocator(demoMapMobile.searchTextfield.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyFiltersIconIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.filterIcon, isDisplayed);
                setLocator(demoMapLaptop.filterIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.filterIcon, isDisplayed);
                setLocator(demoMapTablet.filterIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.filterIcon, isDisplayed);
                setLocator(demoMapMobile.filterIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyQuickLinksListIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                for (WebElement element : demoMapLaptop.quickLinks) {
                    verifyElementIsDisplayed(element, isDisplayed);
                    setLocator(element.toString().split("tor: ")[1].replace("]", ""));
                }
                break;

            case TABLET:
                for (WebElement element : demoMapTablet.quickLinks) {
                    verifyElementIsDisplayed(element, isDisplayed);
                    setLocator(element.toString().split("tor: ")[1].replace("]", ""));
                }
                break;

            case MOBILE:
                for (WebElement element : demoMapMobile.quickLinks) {
                    verifyElementIsNotDisplayed(element);
                    setLocator(element.toString().split("tor: ")[1].replace("]", ""));
                }
                break;
        }

    }

    public void verifyApplifashionIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.applifashionIcon, isDisplayed);
                setLocator(demoMapLaptop.applifashionIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.applifashionIcon, isDisplayed);
                setLocator(demoMapTablet.applifashionIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.applifashionIcon, isDisplayed);
                setLocator(demoMapMobile.applifashionIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void clickOnSearchIcon(Viewport viewport) {
        waitForElementVisibility(demoMapLaptop.searchIcon, 5);
        switch (viewport) {
            case LAPTOP:
                click(demoMapLaptop.searchIcon, "Search Icon in Laptop");
                setLocator(demoMapLaptop.searchIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                click(demoMapTablet.searchIcon, "Search Icon in Tablet");
                setLocator(demoMapTablet.searchIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                click(demoMapMobile.searchIcon_, "Search Icon in Mobile");
                setLocator(demoMapMobile.searchIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyWishListIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.wishlistIcon, isDisplayed);
                setLocator(demoMapLaptop.wishlistIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.wishlistIcon, isDisplayed);
                setLocator(demoMapTablet.wishlistIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.wishlistIcon, isDisplayed);
                setLocator(demoMapMobile.wishlistIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyItemsInCartIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.itemsInCartIcon, isDisplayed);
                setLocator(demoMapLaptop.itemsInCartIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.itemsInCartIcon, isDisplayed);
                setLocator(demoMapTablet.itemsInCartIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.itemsInCartIcon, isDisplayed);
                setLocator(demoMapMobile.itemsInCartIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyListViewIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(demoMapLaptop.listViewIcon, isDisplayed);
                setLocator(demoMapLaptop.listViewIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(demoMapTablet.listViewIcon, isDisplayed);
                setLocator(demoMapTablet.listViewIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(demoMapMobile.listViewIcon, isDisplayed);
                setLocator(demoMapMobile.listViewIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    
}
