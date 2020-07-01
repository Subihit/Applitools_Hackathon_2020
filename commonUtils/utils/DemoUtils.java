package utils;

import org.openqa.selenium.Dimension;

import static utils.BaseTest.browser;
import static utils.BaseTest.getDriver;


public class DemoUtils {

    public void setViewPort(Viewport viewPort) {
        switch (viewPort) {
            case LAPTOP:
                getDriver(browser).manage().window().setSize(new Dimension(viewPort.getWidth(),
                        viewPort.getHeight()));
                getDriver(browser).navigate().refresh();
                break;

            case TABLET:
                getDriver(browser).manage().window().setSize(new Dimension(viewPort.getWidth(),
                        viewPort.getHeight()));
                getDriver(browser).navigate().refresh();
                break;

            case MOBILE:
                getDriver(browser).manage().window().setSize(new Dimension(viewPort.getWidth(),
                        viewPort.getHeight()));
                getDriver(browser).navigate().refresh();
                break;
        }
    }
}
