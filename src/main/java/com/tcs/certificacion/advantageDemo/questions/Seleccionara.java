package com.tcs.certificacion.advantageDemo.questions;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;;

public class Seleccionara implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return Enabled.of(CreateAccountPage.BOTON_REGISTRO).viewedBy(actor).asBoolean();
	}

	public static Seleccionara elBoton() {
		return new Seleccionara();
	}
}
