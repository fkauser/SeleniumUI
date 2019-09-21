package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ContactUs_Page;
import pageObjects.SignIn_Page;


/**********************
 * Created by faisal.kauser 
 ***********************/

public class DriverController {
	public static WebDriver driver;
	public static ContactUs_Page contactUsPage;
	public static SignIn_Page signInPage;


	public static WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			//CONFIG_PROPERTIES_DIRECTORY
			//FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + Constant.CONFIG_PROPERTIES_DIRECTORY);

			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "chrome":
				// code
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

				/*
				* can add additional browsers such as Firefox(Gecko), IE*

				 */
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			/*
			Reference: https://github.com/SeleniumHQ/selenium/wiki/PageFactory
			 */

			contactUsPage = PageFactory.initElements(driver, ContactUs_Page.class);
			signInPage = PageFactory.initElements(driver, SignIn_Page.class);
		}
		return driver;
	}
}
