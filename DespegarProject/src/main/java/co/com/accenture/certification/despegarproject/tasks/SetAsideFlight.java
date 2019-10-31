package co.com.accenture.certification.despegarproject.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.accenture.certification.despegarproject.userinterfaces.Flight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SetAsideFlight implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
			
		actor.attemptsTo(Click.on(Flight.SELECTFLIGHT),
						 Click.on(Flight.POP_UP));
				
			}
	
	public static  SetAsideFlight on(){
        return instrumented( SetAsideFlight.class);
    }
}
