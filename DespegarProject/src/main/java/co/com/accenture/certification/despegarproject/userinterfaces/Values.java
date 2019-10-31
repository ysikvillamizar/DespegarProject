package co.com.accenture.certification.despegarproject.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Values extends PageObject {
	
	public static final Target NAME_TEXT = Target.the("Text element").locatedBy("//div/ul/li/div/div[1]/span[contains(text(),'jessica')]");
	public static final Target LASTNAME_TEXT = Target.the("Text element").locatedBy("//div/ul/li/div/div[2]/span[contains(text(),'villamizar')]");


}
