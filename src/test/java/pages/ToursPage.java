package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ToursPage extends BasePage {

    public ToursPage(WebDriver webDriver) {super(webDriver);}

    @FindBy (css = "a[href='/en/routes/sinaia-saua-varfului-cu-dor-cabana-padina']")
    public WebElement Tour_01MN01Element;

    @FindBy (css = "a[href='/en/routes/ref-rachitele-vf-lespezi-cascada-valul-miresei-ref-rachitele']")
    public WebElement Tour_13MN08Element;

    @FindBy (css = "span.flag-wrapper.flag-favorite.flag-favorite-274782")
    public WebElement tourFavButton;

    @FindBy (css = "span.flag-wrapper.flag-completed-tour.flag-completed-tour-2304")
    public WebElement tourCompButton;

    public void openTour_01MN01() {
        methodsForElements.scrollElementByPixel(0, 450);
        methodsForElements.clickElement(Tour_01MN01Element);
        LoggerUtility.infoTest("The user opens 01MN01 tour");
    }

    public void openTour_13MN08() {
        methodsForElements.scrollElementByPixel(0, 450);
        methodsForElements.clickElement(Tour_13MN08Element);
        LoggerUtility.infoTest("The user opens 13MN08 tour");
    }

    public void clickTourFavButton() {
        methodsForElements.scrollElementByPixel(0, 450);
        methodsForElements.clickElement((tourFavButton));
        LoggerUtility.infoTest("The user favourite tour button");
    }

    public void clickTourCompButton() {
        methodsForElements.scrollElementByPixel(0, 450);
        methodsForElements.clickElement((tourCompButton));
        LoggerUtility.infoTest("The user click on complete tour button");
    }
    
    public void validateTour13MN08isComp() {
        Assert.assertTrue(Tour_13MN08Element.isDisplayed(),"The tour element is displayed");
    }
}
