package com.tcs.certificacion.advantageDemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import java.util.List;
import com.tcs.certificacion.advantageDemo.interactions.Esperar;
import com.tcs.certificacion.advantageDemo.interactions.Loguearse;
import com.tcs.certificacion.advantageDemo.questions.LeeraSu;
import com.tcs.certificacion.advantageDemo.questions.VeraElLink;
import com.tcs.certificacion.advantageDemo.questions.VeraElTitulo;
import com.tcs.certificacion.advantageDemo.questions.VeraLa;
import com.tcs.certificacion.advantageDemo.questions.VeraSusDatos;
import com.tcs.certificacion.advantageDemo.tasks.Actualizar;
import com.tcs.certificacion.advantageDemo.tasks.Cambiar;
import com.tcs.certificacion.advantageDemo.tasks.Editar;
import com.tcs.certificacion.advantageDemo.tasks.Guardar;
import com.tcs.certificacion.advantageDemo.tasks.IngresarA;
import com.tcs.certificacion.advantageDemo.tasks.IrAAccount;
import com.tcs.certificacion.advantageDemo.tasks.IrAMy;
import com.tcs.certificacion.advantageDemo.tasks.Modificar;
import com.tcs.certificacion.advantageDemo.util.drivers.MyDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AdministrarCuentaStepdefinitions {
	Actor actor;
	
	@Given("^que el (.*) se encuentra en la pagina de logueo$")
	public void seEncuentraEnLaPaginaDeLogueo(String usuario) {
		actor = Actor.named(usuario);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		actor.wasAbleTo(Esperar.duranteElTiempo(3000),
				IngresarA.Login());
	}

	@When("^el ingresa las credenciales$")
	public void el_ingresa_las_credenciales(List<String> datos)  {
		actor.attemptsTo(Esperar.duranteElTiempo(1000),
				Loguearse.conElDato(datos.get(2)).enElCampo(datos.get(0)),
				Loguearse.conElDato(datos.get(3)).enElCampo(datos.get(1))
				);
	}
	
	@Then("^el vera su usuario (.*)$")
	public void elVeraSuUsuario(String mensaje) {
		actor.should(seeThat(LeeraSu.nombre(), is(mensaje)));
	}
	
	@Then("^el vera la advertencia (.*)$")
	public void elVeraLaAdvertencia(String mensaje) {
		actor.attemptsTo(Esperar.duranteElTiempo(1000));
		actor.should(seeThat(VeraLa.advertencia(mensaje), is(mensaje)));
	}
	
	@Given("^que el (.*) se encuentra en la pagina My Account$")
	public void queElUsuarioSeEncuentraEnLaPaginaDeLogueo(String usuario, List<String> datos) {
		actor = Actor.named(usuario);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		actor.wasAbleTo(Esperar.duranteElTiempo(3000),
				IngresarA.Login(),
				Esperar.duranteElTiempo(1000),
				Loguearse.conElDato(datos.get(2)).enElCampo(datos.get(0)),
				Loguearse.conElDato(datos.get(3)).enElCampo(datos.get(1)),
				IrAMy.account()
				);
	}
	
	@Then("^el vera su informacion$")
	public void elVeraSuInformacion(List<String> datos) {
		actor.can(seeThat(VeraSusDatos.personales(), is(datos)));
	}
	
	@Then("^el vera el link Edit de la (.*)$")
	public void elVeraElLinkEditDeLaAccountDetails(String seccion) {
		actor.should(seeThat(VeraElLink.deLaSeccion(seccion)));
	}
	
	@Given("^que el (.*) se encuentra en la pagina Account (.*)$")
	public void queElUsuarioSeEncuentraEnLaPaginaAccountDetails(String usuario, String seccion, List<String> datos) {
		actor = Actor.named(usuario);
		actor.can(BrowseTheWeb.with(MyDriver.web().enLaPagina("http://www.advantageonlineshopping.com")));
		actor.wasAbleTo(Esperar.duranteElTiempo(3000),
				IngresarA.Login(),
				Esperar.duranteElTiempo(1000),
				Loguearse.conElDato(datos.get(2)).enElCampo(datos.get(0)),
				Loguearse.conElDato(datos.get(3)).enElCampo(datos.get(1)),
				IrAMy.account(),
				IrAAccount.Details(seccion)
				);
	}
	
	@Given("^el edita los campos$")
	public void elEditaLosCampos(List<String> datos) {
		for(int i = 0; i < datos.size() / 2; i++){
			if(i < 4) {
				actor.attemptsTo(Editar.elDato(datos.get(i + (datos.size()/2))).enElCampo(datos.get(i)));
			}
			else {
				actor.attemptsTo(Actualizar.elDato(datos.get(i + (datos.size()/2))).enElCampo(datos.get(i)));
			}
		}
	}
	
	@When("^el modifica el campo Country por el valor (.*)$")
	public void ElModificaElCampoCountryPorElValorCanada(String pais) {
		actor.attemptsTo(Esperar.duranteElTiempo(2000),
				Modificar.elPais(pais));
	}
	
	@When("^el guarda los cambios$")
	public void ElGuardaLosCambios() {
		actor.attemptsTo(Guardar.losCambios());
	}
	
	@When("^el modifica su password (.*) por (.*)$")
	public void ElModificaSuPassword(String oldPassword, String newPassword) {
		actor.attemptsTo(Esperar.duranteElTiempo(3000),
				Cambiar.elPassword(oldPassword).por(newPassword),
				Guardar.losCambios()
				);
	}
	
	@Then("^el vera el titulo (.*)$")
	public void elVeraElTitulo(String texto) {
		actor.should(seeThat(VeraElTitulo.conElTexto(), is(texto)));
	}
}
