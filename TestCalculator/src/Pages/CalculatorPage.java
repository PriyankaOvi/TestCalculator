package Pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Actions.actions;
import DriverManager.driverInitialize;

public class CalculatorPage {
	
	Logger log = Logger.getLogger(CalculatorPage.class);
	
	
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
	
	@FindBy(id = "three")
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
	
	
	
	public void launchApp()
	{
		driverInitialize.getDriver("Chrome");
		new actions().navigate("https://www.online-calculator.com/full-screen-calculator/");
	}

	public void subtract(String no1,String no2,String no3)
	{
	try {
	clickNum(no1);
	minus.click();
	clickNum(no2);
	equals.click();
	assertEquals(no3, processingArea.getText());
	}
	catch(Exception e1)
	{
		log.error("\n Failed to perform action exception.Exception Occured ->"+e1.getMessage());
	}
	}
	
public void clickNum(String no)
{
	switch (no) {
	case "1":
	    one.click(); 
		break;

	case "2":
	    two.click(); 
		break;

	case "3":
	    three.click(); 
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
	
	default:
		System.out.print("No correct value");
		break;
	}

}
	public void divide(String no1,String no2,String no3)
	{

		try {
			clickNum(no1);
			division.click();
			clickNum(no2);
			equals.click();
			assertEquals(no3, processingArea.getText());
			}
			catch(Exception e1)
			{
				log.error("\n Failed to perform action exception.Exception Occured ->"+e1.getMessage());
			}	
	}

	public void CE()
	{

		try {
			
			}
			catch(Exception e1)
			{
				log.error("\n Failed to perform action exception.Exception Occured ->"+e1.getMessage());
			}	
	}

}
