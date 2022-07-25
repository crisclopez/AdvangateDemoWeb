package com.tcs.certificacion.advantageDemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Enabled;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

public class Loguearse implements Interaction{

	private String campo, dato;
	
	public Loguearse(String dato) {
		this.dato = dato;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(dato).into(HomePage.INPUT_LOGIN.of(campo))
				);
		if(Enabled.of(HomePage.BOTON_LOGUEO).viewedBy(actor).asBoolean()) {
			actor.attemptsTo(Click.on(HomePage.BOTON_LOGUEO));
		}
	}

	public static Loguearse conElDato(String dato) {
		return instrumented(Loguearse.class, dato);
	}
	
	public Loguearse enElCampo(String campo) {
		this.campo = campo;
		return this;
	}
}
