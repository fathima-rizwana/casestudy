package runpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/register.feature","src/test/resorces/login.feature","src/test/resources/search.feature","src/test/resources/cart.feature"},
                 glue="stepdefn",plugin="json:target/cucumber.json")
public class Runcucu {

}
