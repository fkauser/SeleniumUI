package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverController;

/****************************
 * Created by faisal.kauser
 ****************************/
public class SignInSteps extends DriverController {


    @Given("^User access the Sign in form$")
    public void userAccessTheSignInForm() throws Throwable {
        signInPage.getSignInPage();

    }

    @When("^User enters a Email address \"([^\"]*)\"$")
    public void userEntersAEmailAddress(String email) throws Throwable {
      signInPage.enterEmailAddress(email);

    }

    @When("^User click on the create an account button$")
    public void userClickOnTheCreateAnAccountButton() throws Throwable {
        signInPage.clickOnSubmiButton();
    }

    @Then("^the already been registered Error should be thrown$")
    public void theAlreadyBeenRegisteredErrorShouldBeThrown() throws Throwable {
        signInPage.confirmSignInWasUnsuccessful();
    }


}
