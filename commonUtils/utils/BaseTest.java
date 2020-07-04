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
    private Browser browser;
    private static String locator;

    public static void setLocator(String locator) {
        BaseTest.locator = locator;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void setDriver(Browser browser) throws Exception {
        this.browser = browser;
        switch (browser) {
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

    public void setProperty(Browser browser) throws Exception {
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

    @BeforeTest
    @Parameters({"url", "browser", "wait"})
    public void setupTest(String url, String browser, String wait) throws Exception {
        if (!browser.toUpperCase().equals(EDGE.name())) {
            setDriver(Browser.valueOf(browser.toUpperCase()));
            driver.manage().timeouts().implicitlyWait(Integer.parseInt(wait), TimeUnit.SECONDS);
            driver.get(url);
            System.out.println("Browser - " + browser);
            System.out.println("URL - " + url);
        }
    }

    @BeforeMethod
    @Parameters({"url", "browser", "wait"})
    public void setup(String url, String browser, String wait) throws Exception {
        if (browser.toUpperCase().equals(EDGE.name())) {
            setDriver(Browser.valueOf(browser.toUpperCase()));
            driver.manage().timeouts().implicitlyWait(Integer.parseInt(wait), TimeUnit.SECONDS);
            driver.get(url);
            System.out.println("Browser - " + browser);
            System.out.println("URL - " + url);
        }
    }

    @AfterMethod
    public void teardown(ITestResult testResult, ITestContext testContext, Method method) {
        if (browser.name().toUpperCase().equals(EDGE.name())) {
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
        if (!(browser.name().toUpperCase().equals(EDGE.name()))) {
            driver.quit();
            driver = null;
        }
    }

    @DataProvider(name = "viewPort")
    public Object[] viewPort() {
        return Viewport.values();
    }


}
