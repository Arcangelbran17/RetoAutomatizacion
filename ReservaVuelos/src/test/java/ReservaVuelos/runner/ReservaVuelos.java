package ReservaVuelos.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/reservavuelos.feature", tags= {"@tag2"},
glue = {"ReservaVuelos.stepdefinition" }, snippets = SnippetType.CAMELCASE)
public class ReservaVuelos {

}
