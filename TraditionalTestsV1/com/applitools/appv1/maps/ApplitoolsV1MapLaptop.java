package com.applitools.appv1.maps;

import com.applitools.appv1.Pages.ApplitoolsV1PageLaptop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ApplitoolsV1MapLaptop {

//    public ApplitoolsV1MapLaptop(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }

    /**
     * Laptop locators go here
     */

    @FindBy(css = "#INPUTtext____42")
    public WebElement searchTextfield;

    @FindBy(css = "#IINPUTsubmit__btnfullwid__63")
    public WebElement searchButton;

    @FindBy(css = "#I__headericon__44")
    public WebElement searchIcon;

    @FindBy(css = "#A__wishlist__52")
    public WebElement wishlistIcon;

    @FindBy(css = "#I__tiviewgrid__203")
    public WebElement gridViewIcon;

    @FindBy(css = "#I__tiviewlist__204")
    public WebElement listViewIcon;

    @FindBy(css = "#I__tiheart__2505")
    public List<WebElement> heartIcon;

    @FindBy(css = ".ti-control-shuffle")
    public List<WebElement> shuffleIcon;

    @FindBy(css = ".ti-shopping-cart")
    public List<WebElement> addToCartIcon;

    @FindBy(css = "#STRONG____50")
    public WebElement itemsInCartIcon;

    @FindBy(css = "#collapse_1>ul>li")
    public List<WebElement> quickLinks;

    @FindBy(css = "#A____8")
    public WebElement applifashionIcon;

    @FindBy(css = "#UL____21>li")
    public List<WebElement> mainMenuIcons;

    @FindBy(css = "#ti-filter")
    public WebElement filterIcon;

    @FindBy(css = "#SPAN____209")
    public WebElement filtersText;

    @FindBy(css = "#UL____102>li")
    public List<WebElement> colorFilterOptions;

    @FindBy(css = "#filterBtn")
    public WebElement filterButton;

    @FindBy(css = "#product_grid>div")
    public List<WebElement> products;
}
