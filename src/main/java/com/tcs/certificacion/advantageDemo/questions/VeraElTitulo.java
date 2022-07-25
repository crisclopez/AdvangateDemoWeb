package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VeraElTitulo implements Question<String>{
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MyAccountPage.TEXTO).viewedBy(actor).asString();
	}
	
	public static VeraElTitulo conElTexto() {
		return new VeraElTitulo();
	}
}
