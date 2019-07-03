package runpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/register.feature"},
                 glue="stepdefn",plugin="json:target/jsonreport1.json")
public class Runcucu {

}
