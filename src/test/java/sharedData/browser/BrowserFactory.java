package sharedData.browser;

import org.openqa.selenium.WebDriver;
import propertyUtility.PropertyUtility;

import java.util.Map;

public class BrowserFactory {
    public WebDriver getBrowserInstance() {
        PropertyUtility propertyUtility = new PropertyUtility("atfData");
        Map<String, String> browserData = propertyUtility.getAllData();

        String cIcD = System.getProperty("cIcD");
        String browser = System.getProperty("browser");
        if (Boolean.parseBoolean(cIcD)) {
            browserData.put("headless", "--headless=new");
        } else {
            browser = browserData.get("browser");
        }


        switch (browser){
            case "chrome":
                ChromeBrowserService chromeBrowserService = new ChromeBrowserService();
                chromeBrowserService.openBrowser(browserData);
                return chromeBrowserService.getWebDriver();

            case "edge":
                EdgeBrowserService edgeBrowserService = new EdgeBrowserService();
                edgeBrowserService.openBrowser(browserData);
                return edgeBrowserService.getWebDriver();

        }

        return null;
    }
}