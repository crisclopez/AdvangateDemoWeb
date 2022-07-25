package com.tcs.certificacion.advantageDemo.questions;

import java.util.List;

import com.tcs.certificacion.advantageDemo.userinterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VeraQueExistan implements Question<Boolean>{

	static List<String> categorias;
	
	@Override
	public Boolean answeredBy(Actor actor) {
		List<String> categoria = Text.of(HomePage.VENTANA_CATEGORIAS).viewedBy(actor).asList();
		for(int i = 0; i < categorias.size(); i++) {
			for(int j = 0; j < categoria.size(); j++) {
				if(categoria.get(j).equals(categorias.get(i))) {
					return true;
				}
			}
		}
		return false;
	}

	public static VeraQueExistan lasCategorias(List<String> categoria) {
		categorias = categoria;
		return new VeraQueExistan(); 
	}
}
