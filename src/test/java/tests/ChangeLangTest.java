package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LanguageModal;
import pages.TermCondPage;
import sharedData.Hooks;

public class ChangeLangTest extends Hooks {

    @Test
    public void changeLanguageMethod () {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.acceptAllCookies();

        LanguageModal languageModal = new LanguageModal(getWebDriver());
        languageModal.changeLanguageROtoEN();

        homePage.openENTermCondPage();

        TermCondPage termCondPage = new TermCondPage(getWebDriver());
        termCondPage.validateTermsAndCondENText();

        languageModal.changeLanguageENtoRO();
        homePage.openROTermCondPage();
        termCondPage.validateTermeniAndCondROText();
    }
}
