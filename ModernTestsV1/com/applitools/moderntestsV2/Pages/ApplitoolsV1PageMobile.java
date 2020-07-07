package com.applitools.moderntestsV2.Pages;

import com.applitools.moderntestsV2.maps.ApplitoolsV1MapMobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ApplitoolsV1PageMobile extends ApplitoolsV1PageTablet {

    ApplitoolsV1MapMobile v1MapMobile;

    public ApplitoolsV1PageMobile(WebDriver driver) {
        super(driver);
        v1MapMobile = PageFactory.initElements(driver, ApplitoolsV1MapMobile.class);
    }

}
