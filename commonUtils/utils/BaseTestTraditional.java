package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static utils.Browser.EDGE;
import static utils.Reporter.generateHackathonReport;

public class BaseTestTraditional extends BaseTest {

    @Parameters({"browser"})
    @BeforeSuite
    public static void setDriver(String browser) throws Exception {
        driver = Driver.setDriver(browser);
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

        if (testContext.getName().contains("V1")) {
            if (method.getName().contains("Product"))
                generateHackathonReport("Traditional-V1-TestResults.txt", 2, method.getName(), locator,
                        viewport, browser.name(), device, testResult.isSuccess());
            else
                generateHackathonReport("Traditional-V1-TestResults.txt", 1, method.getName(), locator,
                        viewport, browser.name(), device, testResult.isSuccess());
        } else {
            if (method.getName().contains("Task2"))
                generateHackathonReport("Traditional-V2-TestResults.txt", 2, method.getName(), locator,
                        viewport, browser.name(), device, testResult.isSuccess());
            else
                generateHackathonReport("Traditional-V2-TestResults.txt", 1, method.getName(), locator,
                        viewport, browser.name(), device, testResult.isSuccess());
        }
    }

    @AfterTest
    public void teardownTest() {
        if (!(browser.equals(EDGE))) {
            driver.quit();
        }
    }

    @DataProvider(name = "viewPort")
    public Object[] viewPort() {
        return Viewport.values();
    }

}
