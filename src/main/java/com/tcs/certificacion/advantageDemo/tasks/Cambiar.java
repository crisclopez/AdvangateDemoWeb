package com.tcs.certificacion.advantageDemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.tcs.certificacion.advantageDemo.userinterfaces.AccountDetails;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Cambiar implements Task{

	private String oldPassword, newPassword;
	
	public Cambiar(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AccountDetails.MODIFICAR_CONTRASENNA),
				Enter.theValue(oldPassword).into(AccountDetails.CONTRASENA_VIEJA),
				Enter.theValue(newPassword).into(AccountDetails.CONTRASENA_NUEVA),
				Enter.theValue(newPassword).into(AccountDetails.CONFIRM_CONTRASENA));
	}
	
	public static Cambiar elPassword(String oldPassword) {
		return instrumented(Cambiar.class, oldPassword);
	}
	
	public Cambiar por(String newPassword) {
		this.newPassword = newPassword;
		return this;
	}
}
