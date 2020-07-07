package com.applitools.moderntestsV2.Pages;

import com.applitools.moderntestsV2.maps.ApplitoolsV2MapMobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ApplitoolsV2PageMobile extends ApplitoolsV2PageTablet {

    ApplitoolsV2MapMobile v1MapMobile;

    public ApplitoolsV2PageMobile(WebDriver driver) {
        super(driver);
        v1MapMobile = PageFactory.initElements(driver, ApplitoolsV2MapMobile.class);
    }

}
