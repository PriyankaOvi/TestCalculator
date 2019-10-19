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
		element.click();
	}

	public boolean isPresent(WebElement element) {
		return element.isDisplayed();
	}

	public void close() {
		driverInitialize.driver.quit();
	}

	public void navigate(String url) {
		driverInitialize.driver.navigate().to(url);
	}
}
