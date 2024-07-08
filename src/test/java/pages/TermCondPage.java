package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TermCondPage extends BasePage {

    public TermCondPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "block-system-main")
    public WebElement termsAndConditionTextContainer;

    public void validateTermsAndCondENText() {
        String enText = "The use of this website constitutes your unconditional agreement to follow and be bound by the following Terms and Conditions, which apply to the entire content of the website. Therefore, the visitor / user / buyer must read these terms carefully before using the services offered through this website, and in case he/she does not agree, he/she must not use the services and its content.";
        Assert.assertTrue(termsAndConditionTextContainer.getText().contains(enText));
        LoggerUtility.infoTest("Website language was changed and terms and condition page is in EN");
    }

    public void validateTermeniAndCondROText() {
        String roText = "Utilizarea prezentului site presupune exprimarea acordului necondiționat cu privire la termenii şi condiţiile ce urmează, care se aplică întregului conținut al site-ului.  Prin urmare, vizitatorul / utilizatorul / cumpărătorul trebuie să citească cu atenție acești termeni înainte de utilizarea serviciilor oferite prin acest site, iar în cazul în care nu este de acord, nu trebuie să utilizeze serviciile și conținutul acestuia.";
        Assert.assertTrue(termsAndConditionTextContainer.getText().contains(roText));
        LoggerUtility.infoTest("Website language was changed and terms and condition page is in RO");
    }
}
