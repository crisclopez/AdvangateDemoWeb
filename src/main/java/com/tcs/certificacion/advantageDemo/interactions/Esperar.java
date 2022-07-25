package com.tcs.certificacion.advantageDemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction{

	private int tiempo;
	
	public Esperar(int tiempo) {
		this.tiempo = tiempo;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Esperar duranteElTiempo(int tiempo) {
		return instrumented(Esperar.class, tiempo);
	}
}
