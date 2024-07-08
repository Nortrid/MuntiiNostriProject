package actionMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MethodsForElements {
    public WebDriver webDriver;

    public MethodsForElements(WebDriver webDriver) {this.webDriver = webDriver;}

    public void scrollElementByPixel (Integer x, Integer y) {
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }

    public void waitVisibleElement (WebElement element){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement (WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void fillElement(WebElement element, String value){
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void fillPressElement(WebElement element, String value, Keys key) {
        waitVisibleElement(element);
        element.sendKeys(value);
        element.sendKeys(key);
    }

    public void clickElemForce (WebElement element){
        waitVisibleElement(element);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();",element);
    }
}


