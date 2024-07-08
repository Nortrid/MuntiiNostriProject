package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileModal extends BasePage {
    public ProfileModal(WebDriver webDriver) {super(webDriver);}

    @FindBy (css = "a[href='/ro/user/logout']")
    public WebElement logOutButtonRO;

    @FindBy (css = "a[href='/en/user/logout']")
    public WebElement logOutButtonEN;

    @FindBy (xpath = "//span[text()='View profile']")
    public WebElement profileElement;

    public void clickLogOutRO(){
        methodsForElements.clickElement(logOutButtonRO);
        LoggerUtility.infoTest("The user clicks on LogOut");
    }
    public void clickLogOutEN(){
        methodsForElements.clickElement(logOutButtonEN);
        LoggerUtility.infoTest("The user is LoggedOut");
    }

    public void openProfileEN(){
        methodsForElements.clickElement(profileElement);
        LoggerUtility.infoTest("The user opens his profile page");
    }
}
