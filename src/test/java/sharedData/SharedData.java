package sharedData;

import org.openqa.selenium.WebDriver;
import sharedData.browser.BrowserFactory;

public class SharedData {
    private WebDriver WebDriver;

    public void prepareDriver() {
        WebDriver = new BrowserFactory().getBrowserInstance();
    }


    public void clearDriver() {
        WebDriver.quit();

    }

    public WebDriver getWebDriver() {
        return WebDriver;
    }
}
