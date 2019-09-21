package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverController;
/****************************
 * Created by faisal.kauser
 ****************************/
public class MasterHooks extends DriverController {
	
	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDownDriver(Scenario scenario) {
		try {

			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Methods failed: tearDownDriver, Exception: " + e.getMessage());
		}
}
}
