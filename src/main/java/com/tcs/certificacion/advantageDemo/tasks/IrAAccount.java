package com.tcs.certificacion.advantageDemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tcs.certificacion.advantageDemo.userinterfaces.MyAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrAAccount implements Task{

	private String seccion;
	
	public IrAAccount(String seccion) {
		this.seccion = seccion;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(MyAccountPage.LINK_EDIT.of(seccion)));
	}

	public static IrAAccount Details(String seccion) {
		return instrumented(IrAAccount.class, seccion);
	}
}
