package pages;

import actionMethods.MethodsForElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sharedData.Hooks;

public class BasePage {

    protected MethodsForElements methodsForElements;

    protected WebDriver webDriver;

    public BasePage (WebDriver webDriver) {
        this.webDriver = webDriver;
        methodsForElements = new MethodsForElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
