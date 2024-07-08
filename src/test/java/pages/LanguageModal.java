package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguageModal extends BasePage {

    public LanguageModal (WebDriver webDriver) {super(webDriver);}


    @FindBy (xpath= "//label[text() ='en']")
    public WebElement enLanguageElement;

    @FindBy (xpath= "//label[text() ='ro']")
    public WebElement roLanguageElement;

    public void clickOnENButton() {
        methodsForElements.clickElement(enLanguageElement);
    }

    public void clickOnROButton() {
        methodsForElements.clickElement(roLanguageElement);
    }

    public void changeLanguageROtoEN(){
        HomePage homePage = new HomePage(getWebDriver());
        homePage.accessLangDropDown();
        LanguageModal languageModal = new LanguageModal(getWebDriver());
        languageModal.clickOnENButton();
        LoggerUtility.infoTest("The user changes the language of the website from RO to EN");
    }
    private WebDriver getWebDriver() {
        return webDriver;
    }

    public void changeLanguageENtoRO(){
        HomePage homePage = new HomePage(getWebDriver());
        homePage.accessLangDropDown();
        LanguageModal languageModal = new LanguageModal(getWebDriver());
        languageModal.clickOnROButton();
        LoggerUtility.infoTest("The user changes the language of the website from EN to RO");
    }
}
