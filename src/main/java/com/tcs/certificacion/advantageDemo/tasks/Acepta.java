package com.tcs.certificacion.advantageDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

public class Acepta implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CreateAccountPage.I_AGREE));
	}

	public static Acepta lasPoliticas() {
		return instrumented(Acepta.class);
	}
}
