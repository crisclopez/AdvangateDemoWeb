package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LeeraLa implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CreateAccountPage.MENSAJE_USUARIO_EXISTENTE).viewedBy(actor).asString();
	}
	
	public static LeeraLa alerta() {
		return new LeeraLa();
	}
}
