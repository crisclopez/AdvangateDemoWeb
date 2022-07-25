package com.tcs.certificacion.advantageDemo.tasks;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarA implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(HomePage.LOGIN));
	}

	public static IngresarA Login() {
		return instrumented(IngresarA.class);
	}
}