package tests;

import generalObject.ToursObjects;
import org.testng.annotations.Test;
import pages.*;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

public class AddTourToCompletedENTest extends Hooks {

    @Test
    public void addTourToCompTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.acceptAllCookies();

        LogInModalAndMethod logInModalAndMethod = new LogInModalAndMethod(getWebDriver());
        logInModalAndMethod.logInProcedure();

        LanguageModal languageModal = new LanguageModal(getWebDriver());
        languageModal.changeLanguageROtoEN();

        PropertyUtility propertyUtility = new PropertyUtility("Tours");
        ToursObjects toursObjects = new ToursObjects(propertyUtility.getAllData());

        homePage.searchForATour(toursObjects);

        ToursPage toursPage = new ToursPage(getWebDriver());
        toursPage.openTour_13MN08();
        toursPage.clickTourCompButton();

        homePage.accessLogInOrMyAccountModal();

        ProfileModal profileModal = new ProfileModal(getWebDriver());
        profileModal.openProfileEN();

        toursPage.openTour_13MN08();
        toursPage.clickTourCompButton();
    }
}
