package StepDefinition;

import org.apache.log4j.Logger;
import DriverManager.driverInitialize;
import Pages.CalculatorPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Calculator {

	Logger log = Logger.getLogger(Calculator.class.getName());

	CalculatorPage cal;

	public Calculator() {
		cal = new CalculatorPage(driverInitialize.driver);
	}

	@Given("^Launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.out.print("\n\n\n Hi");
		log.info("\n Launching the calculator application");
		CalculatorPage.launchApp();

	}

	@And("^Check the presence of minus sign$")
	public void checkSgn() throws Throwable {
		log.info("\n Checking the minus sign presence");
		//cal.isElementPresent("minus");

	}

	@And("^Check the presence of devide sign$")
	public void checkSign() throws Throwable {
		log.info("\n Checking the devide sign presence");
		cal.isElementPresent("devide");

	}

	@And("^Check the presence of CE sign$")
	public void check_Sign() throws Throwable {
		log.info("\n Checking the clear sign presence");
		cal.isElementPresent("clear");

	}

	@And("^Perform the subtraction of \"([^\"]*)\" and \"([^\"]*)\" equals to \"([^\\\"]*)\"$")
	public void subtraction(String no1, String no2, String no3) throws PendingException {
		log.info("Performing the subtraction");
		cal.subtract(no1, no2, no3);

	}

	@And("^Perform the division of \"([^\"]*)\" and \"([^\"]*)\" equals to \"([^\\\"]*)\" $")
	public void division(String no1, String no2, String no3) throws PendingException {
		log.info("Performing the division");
		cal.divide(no1, no2, no3);

	}

	@And("^Perform the CE operation$")
	public void CE() throws PendingException {
		log.info("Performing the CE operation");
		cal.CE();

	}

	@And("^Enter any number$")
	public void enterNumber() throws PendingException {
		log.info("Entering any number");
		cal.enterNum();

	}

	@And("^Enter any special character$")
	public void enterSplChar() throws PendingException {
		log.info("Entering any spl char");
		cal.enterSplChar();
	}

}
