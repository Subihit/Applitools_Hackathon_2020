package com.applitool.Pages;

import com.applitool.Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DemoPage {

    WebDriver driver;

    public DemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#INPUTtext____42")
    private WebElement searchTextfield;

    @FindBy(css = "#IINPUTsubmit__btnfullwid__63")
    private WebElement searchButton;

    @FindBy(css = "A__btnsearchm__59")
    private WebElement searchIcon;

    @FindBy(css = "#A__wishlist__52")
    private WebElement wishlistIcon;

    @FindBy(css = "#I__tiviewgrid__203")
    private WebElement gridViewIcon;

    @FindBy(css = "#I__tiviewlist__205")
    private WebElement listViewIcon;

    @FindBy(css = "#I__tiheart__2505")
    private List<WebElement> heartIcon;

    @FindBy(css = ".ti-control-shuffle")
    private List<WebElement> shuffleIcon;

    @FindBy(css = ".ti-shopping-cart")
    private List<WebElement> addToCartIcon;

    @FindBy(css = ".ti-shopping-cart")
    private List<WebElement> headersInFooter;

    @FindBy(css = "#A____8")
    private WebElement applifashionIcon;

    @FindBy(css = "#UL____21>li")
    private List<WebElement> mainMenuIcons;

    @FindBy(css = "#ti-filter")
    private WebElement filterIcon;

    @FindBy(css = "#SPAN____209")
    private WebElement filtersText;

//    public void waitForElementVisibility(WebElement element){
//
//        WebDriverWait wait = new FluentWait<WebDriver>();
//
//    }

    public void verifyElementIsDisplayed(WebElement element, boolean isDisplayed) {
        if (isDisplayed)
            assertTrue(element.isDisplayed());
        else assertFalse(element.isDisplayed());
    }

    public void verifySearchTextFieldIsDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(searchTextfield, isDisplayed);
    }

    public void verifyFiltersTextDisplayed(boolean isDisplayed) {
        verifyElementIsDisplayed(filterIcon, isDisplayed);
    }

}
