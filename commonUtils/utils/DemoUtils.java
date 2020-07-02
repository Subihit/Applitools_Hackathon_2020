package utils;

import org.openqa.selenium.Dimension;
import static utils.BaseTest.getDriver;


public class DemoUtils {

    public void setViewPort(Viewport viewPort) {
        switch (viewPort) {
            case LAPTOP:
                setDimensions(viewPort);
                break;

            case TABLET:
                setDimensions(viewPort);
                break;

            case MOBILE:
                setDimensions(viewPort);
                break;
        }
    }

    public void setDimensions(Viewport viewPort){
        getDriver().manage().window().setSize(new Dimension(viewPort.getWidth(),
                viewPort.getHeight()));
        getDriver().navigate().refresh();
    }
}
