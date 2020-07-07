package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static String viewport;
    public static String device;
    static Browser browser;
    static String locator;
    static String url;

    public static void setLocator(String locator) {
        BaseTest.locator = locator;
    }


    public static WebDriver getDriver() {
        return driver;
    }

    @Parameters("browser")
    @BeforeSuite
    public static void setBrowser(String browser) {
        BaseTest.browser = Browser.valueOf(browser.toUpperCase());
    }

    @Parameters("url")
    @BeforeSuite
    public static void setURL(String url) {
        BaseTest.url = url;
        System.out.println("URL - " + url);
    }


    public void setImplicitWait(int wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }


    public void navigateToURL() {
        driver.get(url);
    }

}
