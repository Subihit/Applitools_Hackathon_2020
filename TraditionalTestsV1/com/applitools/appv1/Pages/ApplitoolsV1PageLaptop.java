package com.applitools.appv1.Pages;

import com.applitools.appv1.maps.ApplitoolsV1MapLaptop;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;
import utils.Viewport;

import static org.testng.Assert.assertEquals;
import static utils.BaseTest.setLocator;


public class ApplitoolsV1PageLaptop extends BasePage {

    ApplitoolsV1MapLaptop v1MapLaptop;

    public ApplitoolsV1PageLaptop(WebDriver driver) {
        super(driver);
        v1MapLaptop = PageFactory.initElements(driver, ApplitoolsV1MapLaptop.class);
    }


    public void verifySearchTextFieldIsDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(v1MapLaptop.searchTextfield, isDisplayed);
        setLocator(v1MapLaptop.searchTextfield.toString().split("tor: ")[1].replace("]", ""));
    }

    public void verifyFiltersIconIsDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(v1MapLaptop.filterIcon, isDisplayed);
        setLocator(v1MapLaptop.filterIcon.toString().split("tor: ")[1].replace("]", ""));
    }

    public void verifyQuickLinksListIsDisplayed(boolean isDisplayed) {
        for (WebElement element : v1MapLaptop.quickLinks) {
            verifyElementIsDisplayed(element, isDisplayed);
            setLocator(element.toString().split("tor: ")[1].replace("]", ""));
        }
    }

    public void verifyApplifashionIconIsDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(v1MapLaptop.applifashionIcon, isDisplayed);
        setLocator(v1MapLaptop.applifashionIcon.toString().split("tor: ")[1].replace("]", ""));
    }

    public void clickOnSearchIcon() {
        waitForElementVisibility(v1MapLaptop.searchIcon, 5);
        click(v1MapLaptop.searchIcon, "Search Icon in Laptop");
        setLocator(v1MapLaptop.searchIcon.toString().split("tor: ")[1].replace("]", ""));

    }

    public void clickOnColorCheckboxFilter(int filterSequence) {

        click(v1MapLaptop.colorFilterOptions.get(filterSequence - 1),
                "Color Filter checkbox in Laptop");
        setLocator(v1MapLaptop.colorFilterOptions.get(filterSequence - 1).toString().split("tor: ")[1]
                .replace("]", ""));
    }

    public void clickOnFilterButton() {
        waitForElementVisibility(v1MapLaptop.filterButton, 5);
        click(v1MapLaptop.filterButton, "Filter button in Laptop");
        setLocator(v1MapLaptop.filterButton.toString().split("tor: ")[1].replace("]", ""));
    }

    public void clickOnFilterIcon() {
        driver.navigate().refresh();
        waitForElementVisibility(v1MapLaptop.filterIcon, 5);
        click(v1MapLaptop.filterIcon, "Filter icon in Laptop");
        setLocator(v1MapLaptop.filterIcon.toString().split("tor: ")[1].replace("]", ""));
    }

    public void verifyWishListIconIsDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(v1MapLaptop.wishlistIcon, isDisplayed);
        setLocator(v1MapLaptop.wishlistIcon.toString().split("tor: ")[1].replace("]", ""));
    }

    public void verifyItemsInCartIconIsDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(v1MapLaptop.itemsInCartIcon, isDisplayed);
        setLocator(v1MapLaptop.itemsInCartIcon.toString().split("tor: ")[1].replace("]", ""));
    }

    public void verifyListViewIconIsDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(v1MapLaptop.listViewIcon, isDisplayed);
        setLocator(v1MapLaptop.listViewIcon.toString().split("tor: ")[1].replace("]", ""));
    }

    public void verifyNumberOfProductsThatIsDisplayed(Viewport viewport, int expectedNumberOfProducts) {
        waitForElementVisibility(v1MapLaptop.products.get(0), 5);
        assertEquals(getElementCount(v1MapLaptop.products), expectedNumberOfProducts);
        for (WebElement element : v1MapLaptop.products) {
            verifyElementIsDisplayed(element, true);
            setLocator(element.toString().split("tor: ")[1].replace("]", ""));
        }
    }


}
