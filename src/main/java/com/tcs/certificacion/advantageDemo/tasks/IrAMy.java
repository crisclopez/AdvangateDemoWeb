package com.tcs.certificacion.advantageDemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrAMy implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(HomePage.USUARIO),
					Click.on(HomePage.LINK_Cuenta));
	}

	public static IrAMy account() {
		return instrumented(IrAMy.class);
	}
}
