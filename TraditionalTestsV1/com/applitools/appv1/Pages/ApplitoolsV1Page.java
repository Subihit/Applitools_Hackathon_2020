package com.applitools.appv1.Pages;

import com.applitools.appv1.maps.ApplitoolsV1MapLaptop;
import com.applitools.appv1.maps.ApplitoolsV1MapMobile;
import com.applitools.appv1.maps.ApplitoolsV1MapTablet;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Viewport;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static utils.BaseTest.setLocator;


public class ApplitoolsV1Page {
    WebDriver driver;
    ApplitoolsV1MapLaptop v1MapLaptop;
    ApplitoolsV1MapTablet v1MapTablet;
    ApplitoolsV1MapMobile v1MapMobile;

    public ApplitoolsV1Page(WebDriver driver) {
        this.driver = driver;
        v1MapLaptop = new ApplitoolsV1MapLaptop(driver);
        v1MapTablet = new ApplitoolsV1MapTablet(driver);
        v1MapMobile = new ApplitoolsV1MapMobile(driver);
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
                verifyElementIsDisplayed(v1MapLaptop.searchTextfield, isDisplayed);
                setLocator(v1MapLaptop.searchTextfield.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(v1MapTablet.searchTextfield, isDisplayed);
                setLocator(v1MapTablet.searchTextfield.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsNotDisplayed(v1MapMobile.searchTextfield);
                setLocator(v1MapMobile.searchTextfield.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyFiltersIconIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(v1MapLaptop.filterIcon, isDisplayed);
                setLocator(v1MapLaptop.filterIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(v1MapTablet.filterIcon, isDisplayed);
                setLocator(v1MapTablet.filterIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(v1MapMobile.filterIcon, isDisplayed);
                setLocator(v1MapMobile.filterIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyQuickLinksListIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                for (WebElement element : v1MapLaptop.quickLinks) {
                    verifyElementIsDisplayed(element, isDisplayed);
                    setLocator(element.toString().split("tor: ")[1].replace("]", ""));
                }
                break;

            case TABLET:
                for (WebElement element : v1MapTablet.quickLinks) {
                    verifyElementIsDisplayed(element, isDisplayed);
                    setLocator(element.toString().split("tor: ")[1].replace("]", ""));
                }
                break;

            case MOBILE:
                for (WebElement element : v1MapMobile.quickLinks) {
                    verifyElementIsNotDisplayed(element);
                    setLocator(element.toString().split("tor: ")[1].replace("]", ""));
                }
                break;
        }

    }

    public void verifyApplifashionIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(v1MapLaptop.applifashionIcon, isDisplayed);
                setLocator(v1MapLaptop.applifashionIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(v1MapTablet.applifashionIcon, isDisplayed);
                setLocator(v1MapTablet.applifashionIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(v1MapMobile.applifashionIcon, isDisplayed);
                setLocator(v1MapMobile.applifashionIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void clickOnSearchIcon(Viewport viewport) {
        waitForElementVisibility(v1MapLaptop.searchIcon, 5);
        switch (viewport) {
            case LAPTOP:
                click(v1MapLaptop.searchIcon, "Search Icon in Laptop");
                setLocator(v1MapLaptop.searchIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                click(v1MapTablet.searchIcon, "Search Icon in Tablet");
                setLocator(v1MapTablet.searchIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                click(v1MapMobile.searchIcon_, "Search Icon in Mobile");
                setLocator(v1MapMobile.searchIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyWishListIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(v1MapLaptop.wishlistIcon, isDisplayed);
                setLocator(v1MapLaptop.wishlistIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(v1MapTablet.wishlistIcon, isDisplayed);
                setLocator(v1MapTablet.wishlistIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(v1MapMobile.wishlistIcon, isDisplayed);
                setLocator(v1MapMobile.wishlistIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyItemsInCartIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(v1MapLaptop.itemsInCartIcon, isDisplayed);
                setLocator(v1MapLaptop.itemsInCartIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(v1MapTablet.itemsInCartIcon, isDisplayed);
                setLocator(v1MapTablet.itemsInCartIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(v1MapMobile.itemsInCartIcon, isDisplayed);
                setLocator(v1MapMobile.itemsInCartIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }

    public void verifyListViewIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(v1MapLaptop.listViewIcon, isDisplayed);
                setLocator(v1MapLaptop.listViewIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case TABLET:
                verifyElementIsDisplayed(v1MapTablet.listViewIcon, isDisplayed);
                setLocator(v1MapTablet.listViewIcon.toString().split("tor: ")[1].replace("]", ""));
                break;

            case MOBILE:
                verifyElementIsDisplayed(v1MapMobile.listViewIcon, isDisplayed);
                setLocator(v1MapMobile.listViewIcon.toString().split("tor: ")[1].replace("]", ""));
                break;
        }
    }


}
