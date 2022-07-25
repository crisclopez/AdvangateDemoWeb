package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LeeraSu implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HomePage.USUARIO).viewedBy(actor).asString();
	}
	
	public static LeeraSu nombre() {
		return new LeeraSu();
	}
}
