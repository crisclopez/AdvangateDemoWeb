package com.tcs.certificacion.advantageDemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import com.tcs.certificacion.advantageDemo.userinterfaces.MyAccountPage;

public class VeraElLink implements Question<Boolean>{

	private static String seccion;
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return Enabled.of(MyAccountPage.LINK_EDIT.of(seccion)).viewedBy(actor).asBoolean();
	}
	
	public static VeraElLink deLaSeccion(String dato) {
		seccion = dato;
		return new VeraElLink();
	}
}
