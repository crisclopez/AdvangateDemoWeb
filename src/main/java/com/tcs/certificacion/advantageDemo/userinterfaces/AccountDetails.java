package com.tcs.certificacion.advantageDemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountDetails {
	
	public static final Target CAMPO = Target.the("informacion del usuario").locatedBy("//div[@id = 'formCover']//input[contains(@name,'{0}')]");
	
	public static final Target PAIS = Target.the("Pais").locatedBy("//option[@label = '{0}']");
	
	public static final Target CAMPO2 = Target.the("informacion del usuario").locatedBy("//input[contains(@name,'{0}')]");
	
	public static final Target BOTN_GUARDAR = Target.the("Boton para guardar cambios en datos").locatedBy("//button[@id = 'save_btnundefined']");
	
	public static final Target MODIFICAR_CONTRASENNA = Target.the("Link para modificar contraseña").locatedBy("//a[@translate='Change_Password']");
	
	public static final Target CONTRASENA_VIEJA = Target.the("Campo para ingresar la antigua contraseña").locatedBy("//input[@name = 'old_passwordAccountDetails']");
	
	public static final Target CONTRASENA_NUEVA = Target.the("Campo para ingresar la nueva contraseña").locatedBy("//input[@name = 'new_passwordAccountDetails']");
	
	public static final Target CONFIRM_CONTRASENA = Target.the("Campo para confirmar la nueva contraseña").locatedBy("//input[@name = 'confirm_new_passwordAccountDetails']");
	
}
