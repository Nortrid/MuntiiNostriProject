package pages;

import generalObject.ToursObjects;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement acceptAllCookies;

    @FindBy(id = "dropdownMenu1")
    private WebElement logInAndMyAccountElement;

    @FindBy(className = "dd-selected-text")
    private WebElement languangeModal;

    @FindBy(css = "a[href='/en/terms-and-conditions']")
    private WebElement termsAndConditionsEN;

    @FindBy(css = "a[href='/ro/termeni-si-conditii']")
    private WebElement termsAndConditionsRO;

    @FindBy(css = "a[href='/en/routes']")
    private WebElement toursElementEN;

    @FindBy(css = "a[href='/ro/trasee']")
    private WebElement traseeElementRO;

    @FindBy (id = "edit-search")
    private WebElement searchBar;

    @FindBy(css = "a[href='/ro/products")
    public WebElement shopROElement;

    @FindBy(css = "a[href='/en/products")
    public WebElement shopENElement;

    public void accessLogInOrMyAccountModal() {
        methodsForElements.clickElement(logInAndMyAccountElement);
        LoggerUtility.infoTest("The user clicks on LogIn/Profile element");
    }

    public void accessLangDropDown() {
        methodsForElements.clickElement(languangeModal);
        LoggerUtility.infoTest("The user clicks on language modal");
    }

    public void acceptAllCookies() {
        methodsForElements.clickElement(acceptAllCookies);
        LoggerUtility.infoTest("The user agrees to accept all Cookies for the website");
    }

    public void openENTermCondPage() {
        methodsForElements.clickElement(termsAndConditionsEN);
        LoggerUtility.infoTest("The user opens Terms And Conditions page");
    }

    public void openROTermCondPage() {
        methodsForElements.clickElement((termsAndConditionsRO));
        LoggerUtility.infoTest("The user opens Terms and Conditions RO page");
    }

    public void openToursPageEN() {
        methodsForElements.clickElement(toursElementEN);
        LoggerUtility.infoTest("The user opens Tours page");
}
    public void accessTraseeRO() {
        methodsForElements.clickElement(traseeElementRO);
        LoggerUtility.infoTest("The user opens Trasee page");
    }

    public void accessShop() {
        methodsForElements.clickElement(shopROElement);
        LoggerUtility.infoTest("The user clicks on Shop Drow-Down");
    }

    public void searchForATour(ToursObjects toursObjects) {
        methodsForElements.fillPressElement(searchBar, toursObjects.getTestTourValue(), Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBar.sendKeys(Keys.ENTER);
        LoggerUtility.infoTest("The user uses search bar to find a tour");
    }
}



