package com.tcs.certificacion.advantageDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

public class Ingresar implements Task{

	private String campo, dato;
	
	public Ingresar(String dato) {
		this.dato = dato;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(dato).into(CreateAccountPage.CAMPO.called("Cuadro de texto").of((campo).split(" ")[0].toLowerCase()))
				,Click.on(CreateAccountPage.MENSAJE.called("Mensajes de error").of(campo)));
	}
	
	public static Ingresar elDato(String dato) {
		return instrumented(Ingresar.class, dato);
	}
	
	public Ingresar enElCampo(String campo) {
		this.campo = campo;
		return this;
	}
}
