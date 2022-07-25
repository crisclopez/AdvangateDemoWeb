package com.tcs.certificacion.advantageDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

public class AbrirPagina implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.NEW_ACCOUNT));
	}
	
	public static AbrirPagina deCreacionDeUsuario() {
		return instrumented(AbrirPagina.class);
	}
}
