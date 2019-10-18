package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import DriverManager.driverInitialize;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	Logger log = Logger.getLogger(Hooks.class.getName());
	public static Properties prop = new Properties();

	@Before
	public void beforeScenario() {
		log.getRootLogger().setLevel(Level.ALL);
		log.info("\n Starting the test execution !!");

		try (InputStream io = new FileInputStream(
				new File("C:\\Users\\Pratip Dasgupta\\eclipse-workspace\\TestCalculator\\config\\config.properties"))) {
			prop.load(io);
		} catch (Exception ex) {
			log.error("\n Exception Occured -> " + ex.getStackTrace());
		}
		String browser = prop.getProperty("browser");
		driverInitialize.setDriver(browser);

	}

	@After
	public void afterScenario() {
		log.info("\n Completed the test execution");
	}

}
