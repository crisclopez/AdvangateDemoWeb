package com.tcs.certificacion.advantageDemo.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import com.tcs.certificacion.advantageDemo.interactions.Esperar;
import com.tcs.certificacion.advantageDemo.questions.VeraElBoton;
import com.tcs.certificacion.advantageDemo.questions.VeraElMensaje;
import com.tcs.certificacion.advantageDemo.questions.VeraLosProductos;
import com.tcs.certificacion.advantageDemo.questions.VeraQueExistan;
import com.tcs.certificacion.advantageDemo.tasks.Buscar;

public class BusquedasStepdefinition {
	Actor actor = HomePageAdvantageStepdefinition.actor;

	@Then("^entonces el vera el boton de busqueda$")
	public void entoncesElVeraElBotonDeBusqueda() {
		actor.attemptsTo(Esperar.duranteElTiempo(3000));
		actor.should(seeThat(VeraElBoton.deBusqueda()));
	}

	@When("^el busca (.*)$")
	public void elBusca(String producto) {
		actor.attemptsTo(Esperar.duranteElTiempo(3000),
				Buscar.elProducto(producto));
	}

	@Then("^el vera una ventana con los articulos de la busqueda (.*)$")
	public void elVeraUnaVentanaConLosArticulosDeLaBusqueda(String producto) {
		actor.should(seeThat(VeraLosProductos.queCoinciden(producto)));
	}
	
	@Then("^el vera las categorias de los articulos mostrados en la busqueda$")
	public void elVeraLasCategoriasDeLosArticulosMostradosEnLaBusqueda(List<String> categorias) {
		actor.should(seeThat(VeraQueExistan.lasCategorias(categorias)));
	}

	@Then("^el vera el texto (.*)$")
	public void elVeraElMensaje(String mensaje) {
		actor.should(seeThat(VeraElMensaje.deError()));
	}
}
