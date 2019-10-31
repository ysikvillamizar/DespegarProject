package co.com.accenture.certification.despegarproject.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightDespegar extends PageObject {
	
	
	public static final Target FLIGHT = Target.the("Select the option flight").locatedBy("(//*[@class='button-circle-icon'])[1]");
	public static final Target SOURCE_CITY = Target.the("Select the source city").locatedBy("//*[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-origin-input sbox-primary sbox-places-first places-inline']");
	public static final Target CHOOSE_SOURCE_CITY= Target.the("Select the source city").locatedBy("//*[@class='item -active']");
	public static final Target TARGET_CITY = Target.the("Select the target city").locatedBy("//*[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline']");
	public static final Target CHOOSE_TARGET_CITY= Target.the("Select the target city").locatedBy("//*[@class='item-text']");

	public static final Target DEPARTURE_DATE = Target.the("Select the departure date").locatedBy("//*[@class='input-container sbox-bind-event-click-start-date']");
	public static final Target CHOOSE_DAY_DEPARTURE= Target.the("Select the departure day").locatedBy("(//div[4]/div/div[5]/div[2]/div[4]/span[1]/span[1])[contains(text(),'{0}')]");
	public static final Target CHOOSE_DAY_RETURN= Target.the("Select the return day").locatedBy("(//div[4]/div/div[5]/div[2]/div[4]/span[8]/span[1])[contains(text(),'{0}')]");
	
	public static final Target SEARCH= Target.the("Select the search button").locatedBy("//*[@class='sbox-button -ml3-l -mt5-l']");
	
}