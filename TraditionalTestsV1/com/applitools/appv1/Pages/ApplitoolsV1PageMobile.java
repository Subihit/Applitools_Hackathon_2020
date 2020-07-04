package com.applitools.appv1.Pages;

import com.applitools.appv1.maps.ApplitoolsV1MapLaptop;
import com.applitools.appv1.maps.ApplitoolsV1MapMobile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ApplitoolsV1PageMobile extends ApplitoolsV1PageTablet {

    ApplitoolsV1MapMobile v1MapMobile;

    public ApplitoolsV1PageMobile(WebDriver driver) {
        super(driver);

        //System.out.println(driver);
        v1MapMobile = PageFactory.initElements(driver, ApplitoolsV1MapMobile.class);
        //v1MapLaptop = new ApplitoolsV1MapLaptop(driver);
    }
    //v1MapMobile = new ApplitoolsV1MapMobile();

}
