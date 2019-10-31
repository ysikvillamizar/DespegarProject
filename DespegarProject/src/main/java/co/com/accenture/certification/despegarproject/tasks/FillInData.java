package co.com.accenture.certification.despegarproject.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.accenture.certification.despegarproject.interactions.WaitSeconds;
import co.com.accenture.certification.despegarproject.userinterfaces.SelectTheRate;
import co.com.accenture.certification.despegarproject.userinterfaces.Values;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillInData implements Task{

	private String  name;
	private String lastName ;
	private String identificationNumber;
	private String city;
	private String adress;
	
	
	public FillInData(String name, String lastName, String identificationNumber, String city,String adress) {
	
		this.name = name;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.city = city;
		this.adress = adress;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Click.on(SelectTheRate.PAY_WITH_PSE));
		WaitUntil.the(SelectTheRate.TITLE, isVisible());
		actor.attemptsTo( WaitSeconds.inThePage(10),Scroll.to(SelectTheRate.NAME));			
		actor.attemptsTo(Click.on(SelectTheRate.NAME),
						Enter.theValue(name).into(SelectTheRate.NAME),
						Click.on(SelectTheRate.LASTNAME),
						Enter.theValue(lastName).into(SelectTheRate.LASTNAME),
						Click.on(SelectTheRate.ID),
						Enter.theValue(identificationNumber).into(SelectTheRate.ID),
						Click.on(SelectTheRate.DEPARTMENT),
						Click.on(SelectTheRate.CHOOSE_DEPARTMENT),
						Click.on(SelectTheRate.CITY),
						Enter.theValue(city).into(SelectTheRate.CITY),
						Click.on(SelectTheRate.CHOOSE_CITY),
						Click.on(SelectTheRate.ADRESS),
						Enter.theValue(adress).into(SelectTheRate.ADRESS));
						
					actor.attemptsTo( WaitSeconds.inThePage(10),Scroll.to(SelectTheRate.NAME_FOR_TRAVEL));		
					actor.attemptsTo(	Click.on(SelectTheRate.NAME_FOR_TRAVEL),
						Enter.theValue(name).into(SelectTheRate.NAME_FOR_TRAVEL),
						Click.on(SelectTheRate.LASTNAME_FOR_TRAVEL),
						Enter.theValue(lastName).into(SelectTheRate.LASTNAME_FOR_TRAVEL),
						Click.on(SelectTheRate.ID_FOR_TRAVEL),
						Enter.theValue(identificationNumber).into(SelectTheRate.ID_FOR_TRAVEL),
						Scroll.to(Values.NAME_TEXT));
						
										
	}
	public static  FillInData withTheInformations(String name, String lastName, String identificationNumber, String city, String adress){
        return instrumented( FillInData.class, name,  lastName, identificationNumber, city,	 adress);
    }

}
