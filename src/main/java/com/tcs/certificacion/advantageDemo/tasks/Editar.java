package com.tcs.certificacion.advantageDemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.AccountDetails;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Editar implements Task{

	private String campo, dato;
	
	public Editar(String dato) {
		this.dato = dato;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(dato).into(AccountDetails.CAMPO.called("Cuadro de texto").of((campo).split(" ")[0].toLowerCase())));
	}
	
	public static Editar elDato(String dato) {
		return instrumented(Editar.class, dato);
	}
	
	public Editar enElCampo(String campo) {
		this.campo = campo;
		return this;
	}

}
