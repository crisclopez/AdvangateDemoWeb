package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VeraLa implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HomePage.ADVERTENCIA).viewedBy(actor).asString();
	}

	public static VeraLa advertencia(String mensaje) {
		return new VeraLa();
	}
}
