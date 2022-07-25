package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;

public class VeraLaSeccion implements Question<String>{

	private static String seccion;

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CreateAccountPage.SECCION.of(seccion.split(" ")[0])).viewedBy(actor).asString();
	}
	
	public static VeraLaSeccion conElNombre(String dato) {
		seccion = dato;
		return new VeraLaSeccion();
	}
}
