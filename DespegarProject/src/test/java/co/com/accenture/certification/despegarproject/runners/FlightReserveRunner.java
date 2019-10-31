package co.com.accenture.certification.despegarproject.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		features="src\\test\\resources\\features\\flight_reserve.feature",
		glue="co.com.accenture.certification.despegarproject.stepdefinitions",
		snippets= SnippetType.CAMELCASE
		)
public class FlightReserveRunner {

}
