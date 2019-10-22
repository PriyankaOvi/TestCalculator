import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"StepDefinition"},tags ={"@Sub_TC_001"},
//plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true)						
public class Run {
	

}
