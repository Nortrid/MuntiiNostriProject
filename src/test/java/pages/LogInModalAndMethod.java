package pages;

import generalObject.LogInObjects;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import propertyUtility.PropertyUtility;

public class LogInModalAndMethod extends BasePage {

    public LogInModalAndMethod(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "edit-submit")
    public WebElement logInButton;

    @FindBy(id = "edit-name")
    public WebElement emailField;

    @FindBy(id = "edit-pass")
    public WebElement passwordField;

    public void fillEmailField(String emailFieldValue) {
        methodsForElements.fillElement(emailField, emailFieldValue);
        LoggerUtility.infoTest("The user fills Email field");
    }

    public void fillPasswordField(String passwordFieldValue) {
        methodsForElements.fillElement(passwordField, passwordFieldValue);
        LoggerUtility.infoTest("The user fills Password field");
    }

    public void clickLogIn() {
        methodsForElements.clickElement(logInButton);
        LoggerUtility.infoTest("The user clicks on LogIn");
    }

    public void fillLogInFieldsAndLogIn(LogInObjects logInObjects) {
        fillEmailField(logInObjects.getEmailFieldValue());
        fillPasswordField(logInObjects.getPasswordFieldValue());
        clickLogIn();
    }

    public void logInProcedure() {
        PropertyUtility propertyUtility = new PropertyUtility("LogInCredentials");
        LogInObjects logInObjects = new LogInObjects(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.accessLogInOrMyAccountModal();

        LogInModalAndMethod logInModalAndMethod = new LogInModalAndMethod(getWebDriver());
        logInModalAndMethod.fillLogInFieldsAndLogIn(logInObjects);
        LoggerUtility.infoTest("The user is LoggedIn");
    }

    private WebDriver getWebDriver() {
        return webDriver;
    }
}
