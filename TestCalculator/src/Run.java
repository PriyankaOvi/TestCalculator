import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"StepDefinition"},tags ={"@TC_001_Sub"},
plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true)						
public class Run {
	

}
