package com.tcs.certificacion.advantageDemo.questions;

import java.util.List;
import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Vera implements Question<List>{

	@Override
	public List answeredBy(Actor actor) {
		return Text.of(HomePage.MENU).viewedBy(actor).asList();
	}
	
	public static Vera elMenu() {
		return new Vera();
	}
}
