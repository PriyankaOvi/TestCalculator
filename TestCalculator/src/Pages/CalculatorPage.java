package Pages;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Actions.actions;
import DriverManager.driverInitialize;
import StepDefinition.Hooks;

public class CalculatorPage {

	static Logger log = Logger.getLogger(CalculatorPage.class.getName());

	@FindBy(id = "minus")
	public WebElement minus;

	@FindBy(id = "plus")
	public WebElement plus;

	@FindBy(id = "division")
	public WebElement division;

	@FindBy(id = "equals")
	public WebElement equals;

	@FindBy(id = "one")
	public WebElement one;

	@FindBy(id = "two")
	public WebElement two;

	@FindBy(xpath = "//canvas[@id='canvas']")
	public WebElement three;
	@FindBy(id = "four")
	public WebElement four;

	@FindBy(id = "five")
	public WebElement five;

	@FindBy(id = "six")
	public WebElement six;

	@FindBy(id = "seven")
	public WebElement seven;

	@FindBy(id = "eight")
	public WebElement eight;

	@FindBy(id = "nine")
	public WebElement nine;

	@FindBy(id = "zero")
	public WebElement zero;

	@FindBy(id = "processingArea")
	public WebElement processingArea;

	@FindBy(id = "clear")
	public WebElement clear;

	WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void launchApp() {
		new actions().navigate(Hooks.prop.getProperty("url"));
	}

	public void subtract(String no1, String no2, String no3) {
		try {			
			for(char c : no1.toCharArray())
			{
				clickNum(c);
			}
			// minus.click();
			// clickNum(no2);
			// equals.click();			
			//assertEquals(no3, processingArea.getText());
		} catch (Exception e1) {			
			e1.printStackTrace();
			log.error("\n Failed to perform action exception.Exception Occured ->" + e1.getMessage());
		}
	}

	public void clickNum(Character no) throws Exception {
		switch (no.toString()) {
		case "1":
			one.click();
			break;
		case "2":
			two.click();
			break;
		case "3":
			// Perform operation "6-6=" ->
			driverInitialize.driver.switchTo().frame(driverInitialize.driver.findElement(By.id("fullframe")));
			// Click on 6
			Actions builder = new Actions(driver);
			Action drawAction = (Action) builder.moveToElement(three).click().moveByOffset(20, 40).click().build();
			drawAction.perform();
			// Click on -
			Action drawaction = (Action) builder.moveToElement(three).click().moveByOffset(40, 10).click().build();
			drawaction.perform();
			// Click on 6
			Action draw_Action = (Action) builder.moveToElement(three).click().moveByOffset(20, 40).click().build();
			draw_Action.perform();
			// Click on =
			Action drawAct = (Action) builder.moveToElement(three).click().moveByOffset(100, 5).click().build();
			drawAct.perform();
			break;
		case "4":
			four.click();
			break;
		case "5":
			five.click();
			break;
		case "6":
			six.click();
			break;
		case "7":
			seven.click();
    		break;
		case "8":
			eight.click();
			break;
		case "9":
			nine.click();
			break;
		case "0":
			zero.click();
			break;
		case ".":
			zero.click();
			break;
		default:
			System.out.print("No correct value");
			break;
		}

	}

	public void divide(String no1, String no2, String no3) {
		try {
			//clickNum(no1);
			division.click();
			//clickNum(no2);
			equals.click();
			assertEquals(no3, processingArea.getText());
		} catch (Exception e1) {
			Assert.assertTrue(false);
			log.error("\n Failed to perform action exception.Exception Occured ->" + e1.getMessage());
		}
	}

	public void CE() {
		try {
			clear.click();
			assertTrue(processingArea.getText().isEmpty());
		} catch (Exception e1) {
			Assert.assertTrue(false);
			log.error("\n Failed to perform action exception.Exception Occured ->" + e1.getMessage());
		}
	}

	public void enterNum() {
		try {
			one.click();
			assertTrue(!processingArea.getText().isEmpty());
		} catch (Exception e1) {
			log.error("\n Failed to perform action exception.Exception Occured ->" + e1.getMessage());
		}
	}

	public void enterSplChar() {
		try {
			plus.click();
			assertTrue(!processingArea.getText().isEmpty());
		} catch (Exception e1) {
			Assert.assertTrue(false);
			log.error("\n Failed to perform action exception.Exception Occured ->" + e1.getMessage());
		}
	}

	public void isElementPresent(String sign) {
		try {
			if (sign.equalsIgnoreCase("minus")) {
				minus.isDisplayed();				
			} else if (sign.equalsIgnoreCase("devide")) {
				division.isDisplayed();
			} else {
				clear.isDisplayed();
			}
		} catch (Exception e1) {
			Assert.assertTrue(false);
			log.error("\n Failed to perform action exception.Exception Occured ->" + e1.getMessage());
	}
 }
}
