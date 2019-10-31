package co.com.accenture.certification.despegarproject.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import  static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.accenture.certification.despegarproject.userinterfaces.FlightDespegar;

public class InsertFlightData implements Task{
	
	private String originCity;
	private String destinationCity;
	private String departureDate;
	private String returnDate;

	public InsertFlightData(String originCity, String destinationCity, String departureDate, String returnDate) {
		this.originCity = originCity;
		this.destinationCity = destinationCity;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(FlightDespegar.FLIGHT),
						 Click.on(FlightDespegar.SOURCE_CITY),
						 Enter.theValue(originCity).into(FlightDespegar.SOURCE_CITY),
						 Click.on(FlightDespegar.CHOOSE_SOURCE_CITY),
						 Click.on(FlightDespegar.TARGET_CITY),
						 Enter.theValue(destinationCity).into(FlightDespegar.TARGET_CITY),
						 Click.on(FlightDespegar.CHOOSE_TARGET_CITY),
						 Click.on(FlightDespegar.DEPARTURE_DATE),
						 Click.on(FlightDespegar.CHOOSE_DAY_DEPARTURE.of(departureDate)),
						 Click.on(FlightDespegar.CHOOSE_DAY_RETURN.of(returnDate)),
						 Click.on(FlightDespegar.SEARCH));
							
	}

	public static  InsertFlightData withTheInformations(String originCity, String destinationCity, String departureDate, String returnDate){
        return instrumented( InsertFlightData.class,originCity,  destinationCity,  departureDate,  returnDate);
    }
}
