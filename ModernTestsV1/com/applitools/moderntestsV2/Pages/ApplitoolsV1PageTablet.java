package com.applitools.moderntestsV2.Pages;

import com.applitools.moderntestsV2.maps.ApplitoolsV1MapTablet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ApplitoolsV1PageTablet extends ApplitoolsV1PageLaptop {

    ApplitoolsV1MapTablet v1MapTablet;

    public ApplitoolsV1PageTablet(WebDriver driver) {
        super(driver);
        v1MapTablet = PageFactory.initElements(driver, ApplitoolsV1MapTablet.class);
    }
}
