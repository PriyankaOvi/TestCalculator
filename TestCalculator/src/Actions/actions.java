package Actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import DriverManager.driverInitialize;
import Pages.CalculatorPage;

public class actions {
	Logger log = Logger.getLogger(actions.class);

	public actions() {
		// TODO Auto-generated constructor stub
	}

	public void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			log.error("\n Exception Occured -> " + e.getStackTrace());
		}
	}

	public boolean isPresent(WebElement element) {
		boolean flag = false;
		try {
			flag = element.isDisplayed();
		} catch (Exception e) {
			log.error("\n Exception Occured -> " + e.getStackTrace());
		}
		return flag;
	}

	public void close() {
		try {
			driverInitialize.driver.quit();
		} catch (Exception e) {
			log.error("\n Exception Occured -> " + e.getStackTrace());
		}
	}

	public void navigate(String url) {
		try {
			driverInitialize.driver.navigate().to(url);
		} catch (Exception e) {
			log.error("\n Exception Occured -> " + e.getStackTrace());
		}
	}
}
