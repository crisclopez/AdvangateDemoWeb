package com.tcs.certificacion.advantageDemo.questions;

import java.util.List;
import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VeraLosProductos implements Question<Boolean>{
	
	private static String producto;
	
	@Override
	public Boolean answeredBy(Actor actor) {
		List<String> articulos = Text.of(HomePage.VENTANA_BUSQUEDA).viewedBy(actor).asList();
		for(int i = 0; i < articulos.size(); i++) {
			if(!articulos.get(i).toLowerCase().contains(producto.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
	
	public static Question<Boolean> queCoinciden(String dato) {
		producto = dato;
		return new VeraLosProductos();
	}

}
