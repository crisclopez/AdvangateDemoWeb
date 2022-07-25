package com.tcs.certificacion.advantageDemo.stepdefinitions;

import java.util.List;
import com.tcs.certificacion.advantageDemo.interactions.Esperar;
import com.tcs.certificacion.advantageDemo.questions.Vera;
import com.tcs.certificacion.advantageDemo.questions.VeraElBanner;
import com.tcs.certificacion.advantageDemo.questions.VeraLaBarra;
import com.tcs.certificacion.advantageDemo.util.drivers.MyDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static org.hamcrest.Matchers.is;

public class HomePageAdvantageStepdefinition {
	
	public static Actor actor;
	
	@Given("^que el (.*) se encuentra en la pagina de inicio del portal advantage$")
	public void que_el_usuario_se_encuentra_en_la_pagina_de_inicio_del_portal_advantage(String usuario){
		actor = Actor.named(usuario);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
	}

	@Then("^el vera la barra de menu de navegacion$")
	public void el_vera_la_barra_de_menu_de_navegacion(List <String> items){
		actor.should(seeThat(Vera.elMenu(), is(items)));
	}

	@Then("^el vera el banner de publicidad$")
	public void el_vera_el_banner_de_publicidad( ) throws InterruptedException {
		actor.attemptsTo(Esperar.duranteElTiempo(3000));
		actor.should(seeThat(VeraElBanner.dePublicidad()));
	}
	
	@Then("^el vera las categorias de los productos$")
	public void el_vera_las_categorias_de_los_productos(List<String> categorias) {
		actor.attemptsTo(Esperar.duranteElTiempo(4000));
		actor.should(seeThat(VeraLaBarra.deProductos(), is(categorias)));
	}

}
