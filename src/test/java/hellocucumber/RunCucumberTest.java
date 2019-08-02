package hellocucumber;

//Create cucumber project form cucumber-archetype Maven plugin 
//        https://docs.cucumber.io/guides/10-minute-tutorial/
//        - Implement few steps.

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
}
