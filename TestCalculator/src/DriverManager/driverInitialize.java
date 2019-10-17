package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverInitialize {
	
	public static WebDriver driver ;
	public static void getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pratip Dasgupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();		 	
		}else if(browser.equalsIgnoreCase("Firefox"))
          {
			System.setProperty("webdriver.geco.driver","C:\\Users\\Pratip Dasgupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new FirefoxDriver();
          }
		}

	     
}
