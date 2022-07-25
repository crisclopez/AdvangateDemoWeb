package com.tcs.certificacion.advantageDemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage {
	public static final Target CAMPO = Target.the("").locatedBy("//div[@id = 'formCover']//input[contains(@name,'{0}')]");
	
	public static final Target MENSAJE = Target.the("").locatedBy("//div[@id]//sec-view[@a-hint = '{0}']//label");

	public static final Target PAIS = Target.the("Pais").locatedBy("//option[@label = '{0}']");
	
	public static final Target CHECK_OFFERS = Target.the("Casilla para aceptar envio de ofertas").locatedBy("//input[@name = 'allowOffersPromotion']");
	
	public static final Target I_AGREE = Target.the("Casilla para aceptar politicas de seguridad").locatedBy("//input[@name = 'i_agree']");
	
	public static final Target BOTON_REGISTRO = Target.the("Boton para crear usuario").locatedBy("//button[@id = 'register_btnundefined']");
	
	public static final Target SECCION = Target.the("Seccion de datos").locatedBy("//div[@id = 'formCover']//h3[contains(@translate, '{0}')]");
	
	public static final Target MENSAJE_USUARIO_EXISTENTE = Target.the("Mensaje al tratar de crear un usuario existente").locatedBy("//label[@class=\"center block smollMargin\"]");
}