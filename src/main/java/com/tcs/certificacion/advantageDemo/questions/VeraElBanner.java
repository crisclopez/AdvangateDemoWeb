package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

public class VeraElBanner implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Enabled.of(HomePage.BANNER).viewedBy(actor).asBoolean();
	}
	
	public static VeraElBanner dePublicidad() {
		return new VeraElBanner();
	}
}
