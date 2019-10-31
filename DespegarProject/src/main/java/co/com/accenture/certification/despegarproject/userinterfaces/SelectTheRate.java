package co.com.accenture.certification.despegarproject.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheRate extends PageObject {
	public static final Target PAY_WITH_PSE = Target.the("Select pay with PSE").locatedBy("//*[@for='payment-method-5']");
	public static final Target NAME = Target.the("Select the name").locatedBy("//*[@id=\"invoice-first-name-0\"]");
	public static final Target LASTNAME = Target.the("Select the last name").locatedBy("//*[@id=\"invoice-last-name-0\"]");
	public static final Target ID= Target.the("Select the id").locatedBy("//*[@id=\"invoice-fiscal-identification-number-0\"]");
	public static final Target DEPARTMENT= Target.the("Choose the department").locatedBy("//*[@id=\"invoice-fiscal-address-state-0\"]");
	public static final Target CHOOSE_DEPARTMENT= Target.the("Select department").locatedBy("//*[@id=\"invoice-fiscal-address-state-0\"]/option[2]");
	public static final Target CITY= Target.the("Select the resident city").locatedBy("//*[@id=\"invoice-fiscal-address-city-CASH_TRANSFER_BOG-0\"]");
	public static final Target CHOOSE_CITY= Target.the("Select the city").locatedBy("//*[@id=\"ui-id-1\"]");
	public static final Target ADRESS= Target.the("Insert the resident adress").locatedBy("//*[@class='input-tag invoice-fiscal-address-street ng-untouched ng-pristine ng-invalid']");
	
	public static final Target NAME_FOR_TRAVEL= Target.the("Enter the value of the name").locatedBy("//*[@class='input-tag traveler-first-name ng-untouched ng-pristine ng-invalid']");
	public static final Target LASTNAME_FOR_TRAVEL=Target.the("Enter the value of the lastname").locatedBy("//*[@class='input-tag traveler-last-name ng-untouched ng-pristine ng-invalid']");
	public static final Target ID_FOR_TRAVEL=Target.the("Enter the value of the id").locatedBy("//*[@class='input-tag traveler-identification-number ng-untouched ng-pristine ng-invalid']");
	
	public static final Target TITLE=Target.the("title").locatedBy("//*[@class='eva-3-h4 form-title']");
}
