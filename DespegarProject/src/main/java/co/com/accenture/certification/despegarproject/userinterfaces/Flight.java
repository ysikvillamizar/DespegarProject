package co.com.accenture.certification.despegarproject.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Flight extends PageObject{
	public static final Target SELECTFLIGHT = Target.the("Select the option flight").locatedBy("(//*[@class='-md eva-3-btn -primary'])[1]");
	public static final Target POP_UP = Target.the("Select continue without luggage").locatedBy("//*[@class='eva-3-btn-ghost -lg btn-no ubp-button-continue']");
	
}