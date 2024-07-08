package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ShopPage extends BasePage {

    public ShopPage(WebDriver webDriver) {super(webDriver);}

    @FindBy(css = "a[href='/ro/subscriptions/list']")
    public WebElement subscriptionsListRO;

    @FindBy (xpath = "//div[@class='subscription-card' and .//h4[text()='A3-Abonament Explorator 12 luni']]     //button[contains(@class, 'add-to-cart')]")
    public WebElement subscription12Months;

    @FindBy (css = "a[href='/ro/cart']")
    public WebElement goToCartButtonRO;

    @FindBy (id = "block-system-main")
    public WebElement cartTextContainer;

    @FindBy (id = "edit-edit-delete-0")
    public WebElement removeCartItemButton;

    @FindBy (xpath = "//div[@class='alert alert-block alert-dismissible alert-success messages status']")
    public WebElement confirmItemRemovedTextContainer;

    public void openSubscriptionsListRO() {
        methodsForElements.clickElement(subscriptionsListRO);
        LoggerUtility.infoTest("The user opens subscription list page");

    }

    public void addToCart12MonthsSubs() {
        methodsForElements.clickElement(subscription12Months);
        LoggerUtility.infoTest("The user adds to cart the 12 Month Subscription Item");
    }

    public void clickGoToCart() {
        methodsForElements.clickElement(goToCartButtonRO);
    }

    public void validateCartText() {
        String cartROText = "A3-Abonament Explorator 12 luni";
        Assert.assertTrue(cartTextContainer.getText().contains(cartROText));
        LoggerUtility.infoTest("The cart contains the added item");
    }

    public void removeSubsItemFromCart() {
        methodsForElements.clickElement(removeCartItemButton);
    }

    public void validateItemRemovedCartText() {
        String itemRemovedROText = "A3-Abonament Explorator 12 luni șterse din coșul tău.";
        Assert.assertTrue(confirmItemRemovedTextContainer.getText().contains(itemRemovedROText));
        LoggerUtility.infoTest("The added item was removed from the cart");
    }
}
