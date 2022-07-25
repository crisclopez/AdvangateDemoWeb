package com.tcs.certificacion.advantageDemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tcs.certificacion.advantageDemo.userinterfaces.AccountDetails;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Modificar implements Task{

	private String pais;
	
	public Modificar(String pais) {
		this.pais = pais;
	}
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AccountDetails.PAIS.of(pais)));
	}

	public static Modificar elPais(String pais) {
		return instrumented(Modificar.class, pais);
	}
}
