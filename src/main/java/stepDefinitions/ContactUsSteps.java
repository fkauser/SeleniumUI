package stepDefinitions;
import java.io.IOException;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverController;
/****************************
 * Created by faisal.kauser
 ****************************/

public class ContactUsSteps extends DriverController {

	@Given("^User access the contact us form$")
	public void userAccessTheContactUsForm() throws IOException {
		contactUsPage.getContactUsPage();
	}


	@When("^User Selects a valid Subject \"([^\"]*)\"$")
	public void userSelectsAValidSubject(String value) throws Exception {
		contactUsPage.selectSubject(value);
	}

	@When("^User enters a valid Email address \"([^\"]*)\"$")
	public void userEntersAValidEmailAddress(String emailAddress) throws Throwable {
		contactUsPage.enterEmailAddress(emailAddress);

	}

	@And("^User enters a valid Order reference \"([^\"]*)\"$")
	public void userEntersAValidOrderReference(String orderNumber) throws Throwable {
		contactUsPage.enterOrderReference(orderNumber);
	}

	@And("^User attaches a file$")
	public void userAttachesAFile() throws Exception {
		contactUsPage.attachFile();
	}

	@And("^User enters comments$")
	public void userEntersComments(DataTable dataTable) throws Exception {
		contactUsPage.enterComments(dataTable, 0, 0);
	}

	@When("^User click on the submit button$")
	public void userClickOnTheSubmitButton() throws Exception {
		contactUsPage.clickOnSubmiButton();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void theFormSubmitted() throws Exception  {
		contactUsPage.confirmContactUsFormSubmissionWasSuccessful();

	}

}
