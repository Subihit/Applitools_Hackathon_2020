package com.applitools.moderntestsV2.Pages;

import com.applitools.moderntestsV2.maps.ApplitoolsV2MapTablet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ApplitoolsV2PageTablet extends ApplitoolsV2PageLaptop {

    ApplitoolsV2MapTablet v1MapTablet;

    public ApplitoolsV2PageTablet(WebDriver driver) {
        super(driver);
        v1MapTablet = PageFactory.initElements(driver, ApplitoolsV2MapTablet.class);
    }
}
