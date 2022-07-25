package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Leyendo implements Question<String>{
	
	private static String campo;
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CreateAccountPage.MENSAJE.called("Mensajes de error").of(campo)).viewedBy(actor).asString();
	}
	
	public static Leyendo elCampo(String camp) {
		campo = camp;
		return new Leyendo();
	}

}
