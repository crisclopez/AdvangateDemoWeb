package com.tcs.certificacion.advantageDemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.AccountDetails;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Guardar implements Task{
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AccountDetails.BOTN_GUARDAR));
	}

	public static Guardar losCambios() {
		return instrumented(Guardar.class);
	}
}
