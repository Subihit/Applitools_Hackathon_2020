package com.applitools.appv2.Pages;

import com.applitools.appv2.maps.DemoMapLaptopV2;
import com.applitools.appv2.maps.DemoMapMobileV2;
import com.applitools.appv2.maps.DemoMapTabletV2;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import utils.Viewport;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DemoPageV2 extends DemoMapMobileV2 {

    public DemoPageV2(WebDriver driver) {
        super(driver);
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
            WebDriverWait wait = new WebDriverWait(driver, timeoutSec);

            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException tme) {
            tme.getMessage();
        }

    }

    public void verifySearchTextFieldIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(searchTextfield, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(searchTextfield, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsNotDisplayed(searchTextfield);
//                click(searchTextfield,"Search text");
//                verifyElementIsDisplayed(searchTextfield, isDisplayed);
                break;
        }
    }

    public void verifyFiltersIconIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(filterIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(filterIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(filterIcon, isDisplayed);
                break;
        }
    }

    public void verifyQuickLinksListIsDisplayed(Viewport viewport, boolean isDisplayed) {
        switch (viewport) {
            case LAPTOP:
                for (WebElement element : quickLinks)
                    verifyElementIsDisplayed(element, isDisplayed);
                break;
            case TABLET:
                for (WebElement element : quickLinks)
                    verifyElementIsDisplayed(element, isDisplayed);
                break;
            case MOBILE:
                for (WebElement element : quickLinks) {
                    verifyElementIsNotDisplayed(element);
                }
                break;
        }

    }

    public void verifyApplifashionIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(applifashionIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(applifashionIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(applifashionIcon, isDisplayed);
                break;
        }
    }

    public void clickOnSearchIcon(Viewport viewport) {
        waitForElementVisibility(searchIcon, 5);
        switch (viewport) {
            case LAPTOP:
                click(searchIcon, "Search Icon in Laptop");
                break;

            case TABLET:
                click(searchIcon, "Search Icon in Tablet");
                break;

            case MOBILE:
                click(searchIcon_, "Search Icon in Mobile");
                break;
        }
    }

    public void verifyWishListIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(wishlistIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(wishlistIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(wishlistIcon, isDisplayed);
                break;
        }
    }

    public void verifyItemsInCartIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(itemsInCartIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(itemsInCartIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(itemsInCartIcon, isDisplayed);
                break;
        }
    }

    public void verifyListViewIconIsDisplayed(Viewport viewport, boolean isDisplayed) {

        switch (viewport) {
            case LAPTOP:
                verifyElementIsDisplayed(listViewIcon, isDisplayed);
                break;
            case TABLET:
                verifyElementIsDisplayed(listViewIcon, isDisplayed);
                break;
            case MOBILE:
                verifyElementIsDisplayed(listViewIcon, isDisplayed);
                break;
        }
    }


}
