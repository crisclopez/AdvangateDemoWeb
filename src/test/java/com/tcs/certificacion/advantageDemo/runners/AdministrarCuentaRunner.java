package com.tcs.certificacion.advantageDemo.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\AdministrarCuenta.feature",
	glue = "com.tcs.certificacion.advantageDemo.stepdefinitions",
	snippets = SnippetType.CAMELCASE
	//,tags = "@tag1"
		)
public class AdministrarCuentaRunner {
	
}
