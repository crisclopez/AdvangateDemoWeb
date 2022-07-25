package com.tcs.certificacion.advantageDemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

public class Buscar implements Task{

	private String producto;
	
	public Buscar(String producto) {
		this.producto = producto;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BOTON_BUSQUEDA),
				Enter.theValue(producto+"\n").into(HomePage.INPUT_BUSQUEDA)
				);
	}
	
	public static Buscar elProducto(String producto) {
		return instrumented(Buscar.class, producto);
	}
}
