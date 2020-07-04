package com.applitools.appv1.maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplitoolsV1MapMobile extends ApplitoolsV1MapTablet {

    public ApplitoolsV1MapMobile(WebDriver driver) {
        super(driver);
    }

    /**
     * Mobile locators go here
     */

    @FindBy(css = "#I__headericon__44")
    public WebElement searchIcon_;

}
