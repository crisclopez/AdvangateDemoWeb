package com.tcs.certificacion.advantageDemo.stepdefinitions;

import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import com.tcs.certificacion.advantageDemo.interactions.Esperar;
import com.tcs.certificacion.advantageDemo.questions.Leera;
import com.tcs.certificacion.advantageDemo.questions.LeeraLa;
import com.tcs.certificacion.advantageDemo.questions.LeeraSu;
import com.tcs.certificacion.advantageDemo.questions.Leyendo;
import com.tcs.certificacion.advantageDemo.questions.Seleccionara;
import com.tcs.certificacion.advantageDemo.questions.VeraLaSeccion;
import com.tcs.certificacion.advantageDemo.tasks.AbrirPagina;
import com.tcs.certificacion.advantageDemo.tasks.Acepta;
import com.tcs.certificacion.advantageDemo.tasks.Apretar;
import com.tcs.certificacion.advantageDemo.tasks.Ingresar;
import com.tcs.certificacion.advantageDemo.tasks.IngresarA;
import com.tcs.certificacion.advantageDemo.tasks.Seleccionar;
import com.tcs.certificacion.advantageDemo.util.drivers.MyDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class CuentasNuevosUsuariosStepdefinition {
	public static Actor actor;
	
	@Given("^que el (.*) se encuentra en la pagina de creacion de cuentas nuevas$")
	public void queElUsuarioSeEncuentraEnLaPaginaDeCreacionDeCuentasNuevas(String nombre) {
		actor = Actor.named(nombre);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://advantageonlineshopping.com")));
		actor.wasAbleTo(Esperar.duranteElTiempo(3000),
				IngresarA.Login(),
				AbrirPagina.deCreacionDeUsuario());
	}

	@When("^el ingresa los campos requeridos$")
	public void elIngresaLosCamposRequeridos(List<String> datos) {
		for(int i = 0; i < datos.size() / 2; i++){
			actor.attemptsTo(Ingresar.elDato(datos.get(i + (datos.size()/2))).enElCampo(datos.get(i)));
		}
	}

	@When("^el selecciona el pais (.*) y acepta las politicas de privacidad$")
	public void elSeleccionaElPaisColombiaYAceptaLasPoliticasDePrivacidad(String pais) {
		actor.attemptsTo(Seleccionar.elPais(pais), Acepta.lasPoliticas());
	}
	
	@When("^el crea la cuenta$")
	public void elCreaLaCuenta() throws InterruptedException {
		actor.attemptsTo(Apretar.elBoton());
	}
	
	@Then("^el vera su nombre de usuario (.*)$")
	public void elVeraSuNombreDeUsuario(String mensaje) {
		actor.should(seeThat(LeeraSu.nombre(), is(mensaje)));
	}
	
	@Then("^el vera la alerta (.*)$")
	public void elVeraLaAlerta(String mensaje) {
		actor.attemptsTo(Esperar.duranteElTiempo(2000));
		actor.should(seeThat(LeeraLa.alerta(), is(mensaje)));
	}
	
	@Then("^El vera el boton Register habilitado$")
	public void elVeraElBotonRegisterHabilitado() {
		actor.should(seeThat(Seleccionara.elBoton()));
	}

	@Then("^El vera el boton Register deshabilitado$")
	public void elVeraElBotonRegisterDeshabilitado() {
		actor.should(seeThat(Seleccionara.elBoton(), is(false)));
	}
	
	@When("^el ingresa informacion en el campo$")
	public void elIngresaInformacionEnElCampo(List<String> datos)  {
		actor.attemptsTo(Ingresar.elDato(datos.get(3)).enElCampo(datos.get(2)));
	}

	@Then("^el vera el mensaje de error$")
	public void elVeraElMensajeDeError(List<String> mensaje)  {
		actor.should(seeThat(Leyendo.elCampo(mensaje.get(3)), is(mensaje.get(2))));
	}
	
	@When("^el selecciona a (.*) en la lista$")
	public void elSeleccionaAColombiaEnLaLista(String pais) {
		actor.attemptsTo(Seleccionar.elPais(pais));
	}
	
	@Then("^el vera a (.*) en el campo$")
	public void elVeraAColombiaEnElCampo(String pais)  {
		actor.should(seeThat(Leera.elPais(pais), is(pais)));
	}

	@When("^el verifica un Password erroneo$")
	public void elVerificaUnPasswordErroneo(List<String> datos) {
		actor.attemptsTo(Ingresar.elDato(datos.get(3)).enElCampo(datos.get(2)));
	}
	
	@Then("^el vera la seccion (.*)$")
	public void elVeraLaSeccionAccountDetails(String seccion)  {
		actor.should(seeThat(VeraLaSeccion.conElNombre(seccion), is(seccion)));
	}
}
