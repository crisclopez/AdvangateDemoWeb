package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

public class VeraElBoton implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Enabled.of(HomePage.INPUT_BUSQUEDA).viewedBy(actor).asBoolean();
	}
	
	public static VeraElBoton deBusqueda() {
		return new VeraElBoton();
	}
}
