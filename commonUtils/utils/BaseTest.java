package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static utils.Browser.*;
import static utils.Reporter.generateHackathonReport;

public class BaseTest {

    private static WebDriver driver;
    public static String viewport;
    public static String device;
    private static Browser browser;
    private static String locator;
    private static String url;

    public static void setLocator(String locator) {
        BaseTest.locator = locator;
    }


    public static WebDriver getDriver() { return driver; }

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

    @Parameters({"browser"})
    public static void setDriver(String browser) throws Exception {
        switch (Browser.valueOf(browser.toUpperCase())) {
            case CHROME:
                try {
                    if (driver.equals(null) | !(driver.toString().contains("chrome"))) {
                        setProperty(CHROME);
                        driver = new ChromeDriver();
                    }
                } catch (NullPointerException npe) {
                    setProperty(CHROME);
                    driver = new ChromeDriver();
                }
                break;

            case FIREFOX:
                try {
                    if (driver.equals(null) | !(driver.toString().contains("firefox"))) {
                        setProperty(FIREFOX);
                        driver = new FirefoxDriver();
                    }
                } catch (NullPointerException npe) {
                    setProperty(FIREFOX);
                    driver = new FirefoxDriver();
                }
                break;

            case EDGE:
                try {
                    if (driver.equals(null) | !(driver.toString().contains("edge"))) {
                        setProperty(EDGE);
                        driver = new EdgeDriver();
                    }
                } catch (NullPointerException npe) {
                    setProperty(EDGE);
                    driver = new EdgeDriver();
                }
                break;
        }
    }

    public static void setProperty(Browser browser) throws Exception {
        switch (browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_mac");
                break;

            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver_mac");
                break;

            case EDGE:
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver_mac");
                break;

            default:
                throw new Exception("Invalid browser");
        }
    }


    public void setImplicitWait(int wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }


    public void navigateToURL() {
        driver.get(url);
    }

    @BeforeTest
    @Parameters({"wait"})
    public void setupTest(String wait) throws Exception {
        if (!browser.equals(EDGE)) {
            setDriver(browser.name());
            setImplicitWait(Integer.parseInt(wait));
            navigateToURL();
        }
    }

    @BeforeMethod
    @Parameters({"wait"})
    public void setup(String wait) throws Exception {
        if (browser.equals(EDGE)) {
            setDriver(browser.name());
            setImplicitWait(Integer.parseInt(wait));
            navigateToURL();
        }
    }

    @AfterMethod
    public void teardown(ITestResult testResult, ITestContext testContext, Method method) {
        if (browser.equals(EDGE)) {
            driver.quit();
            driver = null;
        }

        if (testContext.getName().contains("V1"))
            generateHackathonReport("Traditional-V1-TestResults.txt", 1, method.getName(), locator,
                    viewport, browser.name(), device, testResult.isSuccess());
        else generateHackathonReport("Traditional-V2-TestResults.txt", 1, method.getName(), locator,
                viewport, browser.name(), device, testResult.isSuccess());
    }

    @AfterTest
    public void teardownTest() {
        if (!(browser.equals(EDGE))) {
            driver.quit();
            //driver = null;
        }
    }

    @DataProvider(name = "viewPort")
    public Object[] viewPort() {
        return Viewport.values();
    }

}
