package com.tcs.certificacion.advantageDemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {
	
	public static final Target INFORMACION_PERSONAL = Target.the("informacion del usuario").locatedBy("//div[@class = 'cube']//div[@class = 'borderBox']//label");
	
	public static final Target LINK_EDIT = Target.the("Link para editar informacion").locatedBy("//a[contains(@href,'{0}')]");
	
	public static final Target TEXTO = Target.the("Texto de MY ACCOUNT").locatedBy("//h3[@translate = 'MY_ACCOUNT']");
}
