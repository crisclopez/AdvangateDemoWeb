package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Leera implements Question<String>{

	private static String pais;
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CreateAccountPage.PAIS.of(pais)).viewedBy(actor).asString();
	}

	public static Leera elPais(String dato) {
		pais = dato;
		return new Leera();
	}
}
