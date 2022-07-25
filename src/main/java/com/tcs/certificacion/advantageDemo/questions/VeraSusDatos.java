package com.tcs.certificacion.advantageDemo.questions;

import java.util.ArrayList;
import java.util.List;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;
import com.tcs.certificacion.advantageDemo.userinterfaces.MyAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VeraSusDatos implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		List<String> datos = new ArrayList<String>();
		List<String> datosDobles = Text.of(MyAccountPage.INFORMACION_PERSONAL).viewedBy(actor).asList();
		for(int i = 0; i < datosDobles.size() / 2; i++ ) {
			datos.add(i, datosDobles.get(i));
		}
		return datos;
	}
	
	public static VeraSusDatos personales() {
		return new VeraSusDatos();
	}
}
