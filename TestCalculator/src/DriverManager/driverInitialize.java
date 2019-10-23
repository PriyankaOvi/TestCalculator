package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverInitialize {
	
	public static WebDriver driver ;
	public static void setDriver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		   	driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("Firefox"))
          {
			System.setProperty("webdriver.geco.driver",System.getProperty("user.dir")+"\\lib\\gecodriver.exe");
		    driver = new FirefoxDriver();
          }
		}

	     
}
