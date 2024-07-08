package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInModalAndMethod;
import pages.ProfileModal;
import sharedData.Hooks;

public class LogOutROTest extends Hooks {

    @Test
    public void logOutMethod () {
    HomePage homePage = new HomePage(getWebDriver());
    homePage.acceptAllCookies();

    LogInModalAndMethod logInModalAndMethod = new LogInModalAndMethod(getWebDriver());
    logInModalAndMethod.logInProcedure();

    homePage.accessLogInOrMyAccountModal();
    ProfileModal profileModal = new ProfileModal(getWebDriver());
    profileModal.clickLogOutRO();
    }
}
