package com.applitool.Tests;

import com.applitool.Pages.DemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class BaseTest {

    private WebDriver driver = null;

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac");
        try {
            if (driver.equals(null))
                driver = new ChromeDriver();
        } catch (NullPointerException npe) {
            driver = new ChromeDriver();
        } finally {
            return driver;
        }
    }

    @BeforeClass
    //@Parameters("wait")
    public void setup() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().get("https://demo.applitools.com/gridHackathonV1.html");

    }

    @AfterClass
    public void teardown() {
        getDriver().quit();
    }

    @DataProvider
    public Object[] browser() {
        return new Object[]{"chrome", "firefox", "edge"};
    }


}
