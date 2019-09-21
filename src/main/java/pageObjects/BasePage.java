package pageObjects;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverController;

/****************************
 * Created by faisal.kauser
 ****************************/
public class BasePage extends DriverController {
	protected WebDriverWait wait;
	protected JavascriptExecutor jsExecutor;
	private static String screenshotName;

	public BasePage() throws IOException {
		this.wait = new WebDriverWait(driver, 15);
		jsExecutor = ((JavascriptExecutor) driver);
	}

	/**********************************************************************************
	 **CLICK METHODS
	 * @throws IOException 
	 **********************************************************************************/
	public void waitAndClickElement(WebElement element) throws InterruptedException, IOException {
		boolean clicked = false;
		int attempts = 0;
		while (!clicked && attempts < 10) {
			try {
				this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();

				System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
				clicked = true;
			} catch (Exception e) {
				System.out.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
				Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
			}
			attempts++;
		}
	}



	/**********************************************************************************
	 **SEND KEYS METHODS /
	 **********************************************************************************/
	public void sendKeysToWebElement(WebElement element, String textToSend) throws Exception {
		try {
			this.WaitUntilWebElementIsVisible(element);
			element.clear();
			element.sendKeys(textToSend);
			System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<"+ element.toString() + ">");
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + textToSend);
			Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
		}
	}


	

	/**********************************************************************************
	 **wait Method
	 **********************************************************************************/
	public boolean WaitUntilWebElementIsVisible(WebElement element) {
		try {
			this.wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
			return true;
		} catch (Exception e) {
			System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
			Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
			return false;
		}
	}






	/*********************************************************************************
	 **returnDateStamp : Date Method - to name the screenshots
	 **captureScreenshot : to capture the Screenshots
	 *********************************************************************************/
	

	public static String returnDateStamp(String fileExtension) {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
		return date;
	}
	
	public static void captureScreenshot() throws IOException, InterruptedException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		screenshotName = returnDateStamp(".jpg");
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName));

			}

/**********************************************************************************
	For Drop Down List - such as Subject Heading on contact us page
 **********************************************************************************/



	public void selectDropDownList(WebElement element, String textValue) throws IOException {

		try {
			Select selVal = new Select(element);
			selVal.selectByValue(textValue);
			System.out.println(selVal.getFirstSelectedOption().getText());
			System.out.println("Successfully Selected the following keys: '" + textValue + "' to element: " + "<"+ element.toString() + ">");
			}
			catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + textValue);
			Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
		}


	}



	/**********************************************************************************
	 For Drop Down List - such as Subject Heading on contact us page
	 **********************************************************************************/



	public void uploadFile(WebElement element, String path) throws IOException {

		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			element.sendKeys(path);

			System.out.println("Successfully sent the following keys: " + path + ", to the following WebElement: " + "<" + element.toString() + ">");
		} catch (Exception e) {
			System.out.println("Unable to send the following keys: " + path + ", to the following WebElement: " + "<" + element.toString() + ">");
			Assert.fail("Unable to select the required text from the dropdown menu, Exception: " + e.getMessage());
		}

	}



} // class
