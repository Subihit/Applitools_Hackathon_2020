package utils;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static utils.Browser.*;


public class BaseTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public void setDriver(Browser browser) throws Exception {
        switch (browser) {
            case CHROME:
                try {
                    if (driver.equals(null) | driver.toString().contains("firefox") | driver.toString().contains("edge")) {
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
                    if (driver.equals(null) | driver.toString().contains("chrome") | driver.toString().contains("edge")) {
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
                    if (driver.equals(null) | driver.toString().contains("chrome") | driver.toString().contains("firefox")) {
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

    @BeforeMethod
    @Parameters({"url", "browser", "wait"})
    public void setup(String url, String browser, String wait) throws Exception {
        setDriver(Browser.valueOf(browser.toUpperCase()));
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(wait), TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
        driver = null;
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
