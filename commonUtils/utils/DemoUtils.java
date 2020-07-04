package utils;

import org.openqa.selenium.Dimension;

import static utils.BaseTest.*;


public class DemoUtils {

    public void setViewPort(Viewport viewPort) {
        switch (viewPort) {
            case LAPTOP:
                setDimensions(viewPort);
                viewport = viewPort.getWidth() + "X" + viewPort.getHeight();
                device = viewPort.name();
                break;

            case TABLET:
                setDimensions(viewPort);
                viewport = viewPort.getWidth() + "X" + viewPort.getHeight();
                device = viewPort.name();
                break;

            case MOBILE:
                setDimensions(viewPort);
                viewport = viewPort.getWidth() + "X" + viewPort.getHeight();
                device = viewPort.name();
                break;
        }
    }

    public void setDimensions(Viewport viewPort){
        getDriver().manage().window().setSize(new Dimension(viewPort.getWidth(),
                viewPort.getHeight()));
        getDriver().navigate().refresh();
    }
}
