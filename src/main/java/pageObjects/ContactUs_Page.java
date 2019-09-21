package pageObjects;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import cucumber.api.DataTable;
import utils.Constant;

/****************************
 * Created by faisal.kauser
 ****************************/
public class ContactUs_Page extends BasePage{
	public @FindBy(id = "id_contact") WebElement dropDown_List;
	public @FindBy(xpath = "//*[@id=\"email\"]") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "//*[@id=\"id_order\"]") WebElement textfield_OrderReference;
	public @FindBy(xpath = "//*[@id=\"message\"]") WebElement textfield_Message;
	public @FindBy(xpath = "//*[@id=\"submitMessage\"]") WebElement button_Send;

	
	public ContactUs_Page() throws IOException {
		super();
	}
	


	public ContactUs_Page getContactUsPage() throws IOException {
		getDriver().get("http://automationpractice.com/index.php?controller=contact");
		return new ContactUs_Page();
	}



	public ContactUs_Page selectSubject(String dropdownList) throws Exception {
		selectDropDownList(dropDown_List, dropdownList);
		return new ContactUs_Page();
	}



	public ContactUs_Page enterEmailAddress(String emailAddress) throws Exception {
		sendKeysToWebElement(textfield_EmailAddress, emailAddress);
		return new ContactUs_Page();
	}
	


	public ContactUs_Page enterOrderReference(String orderReference) throws Exception {
		sendKeysToWebElement(textfield_OrderReference, orderReference);
		return new ContactUs_Page();
	}


		public ContactUs_Page attachFile()throws Exception{
		WebElement uploadElement = getDriver().findElement(By.id("fileUpload"));
		uploadElement.sendKeys(Constant.FILE_TO_UPLOAD);
		return new ContactUs_Page();
	}




	public ContactUs_Page enterComments(DataTable dataTable, int row, int column) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textfield_Message, data.get(row).get(column));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page clickOnSubmiButton() throws Exception {
		//Assert.fail();
		waitAndClickElement(button_Send);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page confirmContactUsFormSubmissionWasSuccessful() throws Exception {
		WebElement thanksContactUsPage = getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		WaitUntilWebElementIsVisible(thanksContactUsPage);
		Assert.assertEquals("yourmessagehasbeensuccessfullysenttoourteam.", thanksContactUsPage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
		return new ContactUs_Page();
	}

}
