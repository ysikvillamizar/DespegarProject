package co.com.accenture.certification.despegarproject.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.accenture.certification.despegarproject.questions.CompareTheValues;
import co.com.accenture.certification.despegarproject.tasks.FillInData;
import co.com.accenture.certification.despegarproject.tasks.InsertFlightData;
import co.com.accenture.certification.despegarproject.tasks.Navigate;
import co.com.accenture.certification.despegarproject.tasks.SetAsideFlight;
import co.com.accenture.certification.despegarproject.userinterfaces.OptionPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FlightReserveStepDefinition extends PageObject{
	
	
	 @Managed(driver = "chrome")
	    private WebDriver herBrowser = null;


	    @Before
	    public void setUp() {
	        OnStage.setTheStage(new OnlineCast());
	        OnStage.theActorCalled("Jessica").can(
	                BrowseTheWeb.with(herBrowser));
	    }
	

	    @Given("^that Actor wants to look for a one way flight$")
	    public void thatActorWantsToLookForAOneWayFlight() throws Exception {
	    	theActorInTheSpotlight().wasAbleTo(Navigate.in(OptionPage.Despegar));
	    }
	    
	    @When("^The Actor insert \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" of the fight$")
	    public void theActorInsertAndOfTheFight(String originCity, String destinationCity, String departureDate, String returnDate) throws Exception {
	    	theActorInTheSpotlight().attemptsTo(InsertFlightData.withTheInformations(originCity, destinationCity, departureDate, returnDate));
	        
	    }
	    
	    @And("^The Actor select the flight$")
	    public void theActorSelectTheFlight() throws Throwable {
	    	theActorInTheSpotlight().attemptsTo(SetAsideFlight.on());
	 	    
	    }

	    @And("^The Actor insert \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"  , \"([^\"]*)\" and \"([^\"]*)\" of the actor$")
	    public void theActorInsertAndOfTheActor(String name, String lastName, String identificationNumber, String city, String adress) throws Exception {
	       	theActorInTheSpotlight().attemptsTo(FillInData.withTheInformations(name, lastName, identificationNumber, city, adress));
	  	  
	    }


	    @Then("^The Actor should your data \"([^\"]*)\" and \"([^\"]*)\" on the screen$")
	    public void theActorShouldYourDataAndOnTheScreen(String name, String lastName) throws Exception {
	    	theActorInTheSpotlight().should(seeThat(CompareTheValues.OfTheForm(name,lastName)));
	    }


}
