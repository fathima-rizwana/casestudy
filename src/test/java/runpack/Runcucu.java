package runpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/cart.feature"},
                 glue="stepdefn",plugin="junit:target/xmlreport.xml")
public class Runcucu {

}
