package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInModalAndMethod;
import pages.ShopPage;
import sharedData.Hooks;

public class AddProductTocartROTest extends Hooks {

    @Test
    public void addProductToCartROMethod() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.acceptAllCookies();

        LogInModalAndMethod logInModalAndMethod = new LogInModalAndMethod(getWebDriver());
        logInModalAndMethod.logInProcedure();

        homePage.accessShop();

        ShopPage shopPage = new ShopPage(getWebDriver());
        shopPage.openSubscriptionsListRO();
        shopPage.addToCart12MonthsSubs();
        shopPage.clickGoToCart();
        shopPage.validateCartText();
        shopPage.removeSubsItemFromCart();
        shopPage.validateItemRemovedCartText();
    }
}
