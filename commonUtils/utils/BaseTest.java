package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    private static WebDriver driver = null;
    public static String browser;


    public static WebDriver getDriver(String browser) {
        BaseTest.browser = browser;
        if ("CHROME".equals(browser.toUpperCase())) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac");
            setDriver(browser);
            return driver;
        } else if ("FIREFOX".equals(browser.toUpperCase())) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver_mac");
            setDriver(browser);
            return driver;
        } else if ("EDGE".equals(browser.toUpperCase())) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver_mac");
            setDriver(browser);
            return driver;
        } else return null;

    }

    public static void setDriver(String browser) {
        if ("CHROME".equals(browser.toUpperCase())) {
            try {
                if (driver.equals(null))
                    driver = new ChromeDriver();
            } catch (NullPointerException npe) {
                driver = new ChromeDriver();
            }
        } else if ("FIREFOX".equals(browser.toUpperCase())) {
            try {
                if (driver.equals(null))
                    driver = new FirefoxDriver();
            } catch (NullPointerException npe) {
                driver = new FirefoxDriver();
            }
        } else if ("EDGE".equals(browser.toUpperCase())) {
            try {
                if (driver.equals(null))
                    driver = new FirefoxDriver();
            } catch (NullPointerException npe) {
                driver = new ChromeDriver();
            }
        }
    }

    @BeforeTest()
    @Parameters({"url", "browser"})
    public void setup( String url, String browser) {
        this.browser = browser;
        try {
            getDriver(browser).manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            getDriver(browser).get(url);
        } catch (Exception exz) {

        }
    }

    @AfterSuite
    public void teardown() {
        try {
            getDriver(browser).quit();
        } catch (Exception ex) {

        }
    }

    @DataProvider
    public Object[] browser() {
        return new Object[]{"chrome", "firefox", "edge"};
    }

    @DataProvider(name = "viewPort")
    public Object[] viewPort() {
        return Viewport.values();
    }


}
