package com.tcs.certificacion.advantageDemo.questions;

import java.util.List;
import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VeraLaBarra implements Question<List>{

	@Override
	public List answeredBy(Actor actor) {
		return Text.of(HomePage.PRODUCTOS).viewedBy(actor).asList();
	}
	
	public static VeraLaBarra deProductos() {
		return new VeraLaBarra();
	}
}
