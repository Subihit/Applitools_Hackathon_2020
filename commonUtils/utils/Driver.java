package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static utils.Browser.*;
import static utils.Browser.EDGE;

public class Driver {

    public static WebDriver setDriver(String browser) throws Exception {
        WebDriver driver = null;
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
        return driver;
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

}
