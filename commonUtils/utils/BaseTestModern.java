package utils;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static com.google.common.base.Strings.isNullOrEmpty;
import static utils.Browser.*;
import static utils.Driver.setProperty;
import static utils.Reporter.generateHackathonReport;

public class BaseTestModern extends BaseTest{

    public VisualGridRunner runner;
    public Eyes eyes;
    public static BatchInfo batch;

    @BeforeClass
    public static void setBatch() {
        // Must be before ALL tests (at Class-level)
        batch = new BatchInfo("UFG Hackathon");
    }

    @BeforeMethod
    public void beforeEach() throws Exception {
        // Initialize the Runner for your test.
        runner = new VisualGridRunner(10);

        // Initialize the eyes SDK
        eyes = new Eyes(runner);

        setUp(eyes);

        // Set your personal Applitols API Key from your environment variables.


        // Use Chrome browser
        driver = Driver.setDriver(browser.name());

        // Set AUT's name, test name and viewport size (width X height)
        // We have set it to 800 x 600 to accommodate various screens. Feel free to
        // change it.

        // Navigate the browser to the "ACME" demo app.
        //driver.get("https://demo.applitools.com/gridHackathonV1.html");
        driver.get(url);

        // check the login page with fluent api, see more info here
        // https://applitools.com/docs/topics/sdk/the-eyes-sdk-check-fluent-api.html

    }

    public static void setUp(Eyes eyes) {

        // Initialize eyes Configuration
        Configuration config = new Configuration();

        // You can get your api key from the Applitools dashboard
        config.setApiKey("50ObYCju34e82s2twYFaIoMvoNsRm4w9MPzGWjiV107x0110");

        // create a new batch info instance and set it to the configuration
        config.setBatch(new BatchInfo("UFG Hackathon"));

        // Add browsers with different viewports
        config.addBrowser(1200, 700, BrowserType.CHROME);
        config.addBrowser(768, 700, BrowserType.CHROME);
        config.addBrowser(1200, 700, BrowserType.FIREFOX);
        config.addBrowser(768, 700, BrowserType.FIREFOX);
        config.addBrowser(500, 700, BrowserType.FIREFOX);
        config.addBrowser(1200, 700, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(768, 700, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(500, 700, BrowserType.EDGE_CHROMIUM);


        // Add mobile emulation devices in Portrait mode
        config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);

        // Set the configuration object to eyes
        eyes.setConfiguration(config);

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();

        TestResultsSummary allTestResults = runner.getAllTestResults(false);
        System.out.println(allTestResults);
    }

}
