package com.tcs.certificacion.advantageDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

public class Cerrar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.USUARIO),
				Click.on(HomePage.CERRAR_SESION)
				);
	}
	
	public static Cerrar sesion() {
		return instrumented(Cerrar.class);
	}
}
