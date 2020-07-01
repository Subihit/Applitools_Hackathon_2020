package com.applitools.appv2.maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoMapTabletV2 {

    WebDriver driver;

    public DemoMapTabletV2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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

    @FindBy(css = "#A____204")
    public WebElement listViewIcon;

    @FindBy(css = "#I__tiheart__2505")
    public List<WebElement> heartIcon;

    @FindBy(css = ".ti-control-shuffle")
    public List<WebElement> shuffleIcon;

    @FindBy(css = ".ti-shopping-cart")
    public List<WebElement> addToCartIcon;

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

    @FindBy(css = "#STRONG____50")
    public WebElement itemsInCartIcon;
}
