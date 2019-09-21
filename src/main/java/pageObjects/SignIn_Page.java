package pageObjects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;

/****************************
 * Created by faisal.kauser
 ****************************/
public class SignIn_Page extends BasePage{

    public @FindBy(className = "login") WebElement button_SignIn;
    public @FindBy(xpath = "//*[@id=\"create-account_form\"]/h3") WebElement heading_CreateAccount;
    public @FindBy(id = "email_create") WebElement textfield_Email;
    public @FindBy(id = "SubmitCreate") WebElement button_CreatAccount;
    public @FindBy(id = "create_account_error") WebElement alert_ErrorField;
    public @FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li") WebElement alert_ErrorMessage;



    public SignIn_Page() throws IOException {
        super();
    }

    public SignIn_Page getSignInPage() throws IOException, InterruptedException {

        getDriver().get("http://automationpractice.com/index.php?");
        waitAndClickElement(button_SignIn);
        WaitUntilWebElementIsVisible(heading_CreateAccount);
        Assert.assertEquals("CREATE AN ACCOUNT", heading_CreateAccount.getText());
        return new SignIn_Page();
    }

    public SignIn_Page enterEmailAddress(String emailAddress) throws Exception {
        sendKeysToWebElement(textfield_Email, emailAddress);
        return new SignIn_Page();
    }

    public SignIn_Page clickOnSubmiButton() throws Exception {
        waitAndClickElement(button_CreatAccount);
        return new SignIn_Page();
    }

    public SignIn_Page confirmSignInWasUnsuccessful() throws Exception {

        WaitUntilWebElementIsVisible(alert_ErrorField);
        Assert.assertEquals("An account using this email address has already been registered. Please enter a valid password or request a new one.", alert_ErrorMessage.getText());
        return new SignIn_Page();
    }
}
