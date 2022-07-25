package com.tcs.certificacion.advantageDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.advantageDemo.userinterfaces.CreateAccountPage;

public class Seleccionar implements Task{

	private String pais;
	
	public Seleccionar(String pais) {
		this.pais = pais;
	}
	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CreateAccountPage.PAIS.of(pais)));
	}

	public static Seleccionar elPais(String pais) {
		return instrumented(Seleccionar.class, pais);
	}
}
