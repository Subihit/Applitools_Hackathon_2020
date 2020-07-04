package com.applitools.appv1.Pages;

import com.applitools.appv1.maps.ApplitoolsV1MapLaptop;
import com.applitools.appv1.maps.ApplitoolsV1MapTablet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ApplitoolsV1PageTablet extends ApplitoolsV1PageLaptop {

    ApplitoolsV1MapTablet v1MapTablet;

    public ApplitoolsV1PageTablet(WebDriver driver) {
        super(driver);
        //System.out.println(driver.toString());
        //ApplitoolsV1MapLaptop v1MapLaptop ;

        v1MapTablet = PageFactory.initElements(driver, ApplitoolsV1MapTablet.class);
            //v1MapLaptop = new ApplitoolsV1MapLaptop(driver);
        }

}
