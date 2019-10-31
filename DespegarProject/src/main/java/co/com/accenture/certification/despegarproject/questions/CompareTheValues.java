package co.com.accenture.certification.despegarproject.questions;
import co.com.accenture.certification.despegarproject.userinterfaces.Values;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareTheValues implements Question<Boolean>{

	String name;
	String lastName;
	
	
	public CompareTheValues(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}


	@Override
	public Boolean answeredBy(Actor actor) {
		String passengerName=Text.of(Values.NAME_TEXT).viewedBy(actor).asString();
		String passengerLastName=Text.of(Values.LASTNAME_TEXT).viewedBy(actor).asString();
		
		return (passengerName.equals(name) && 
				passengerLastName.equals(lastName));
			
		
	}

	
	public static Question<Boolean> OfTheForm(String name, String lastName){
		return new CompareTheValues(name, lastName);
	}
	


}
