package tests;

import org.testng.annotations.Test;
import pages.*;
import sharedData.Hooks;


public class AddTourToFavENTest extends Hooks {

    @Test
    public void addTourToFavMethod() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.acceptAllCookies();

        LogInModalAndMethod logInModalAndMethod = new LogInModalAndMethod(getWebDriver());
        logInModalAndMethod.logInProcedure();

        LanguageModal languageModal = new LanguageModal(getWebDriver());
        languageModal.changeLanguageROtoEN();

        homePage.openToursPageEN();

        ToursPage toursPage = new ToursPage(getWebDriver());
        toursPage.openTour_01MN01();
        toursPage.clickTourFavButton();

        homePage.accessLogInOrMyAccountModal();

        ProfileModal profileModal = new ProfileModal(getWebDriver());
        profileModal.openProfileEN();

        toursPage.openTour_01MN01();
        toursPage.clickTourCompButton();
    }
}
