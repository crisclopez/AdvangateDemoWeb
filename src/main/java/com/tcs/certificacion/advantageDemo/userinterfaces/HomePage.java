package com.tcs.certificacion.advantageDemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	
	public static final Target NEW_ACCOUNT = Target.the("Link para crea una nueva cuenta").locatedBy("//a[text() = 'CREATE NEW ACCOUNT']");
	
	public static final Target LOGIN = Target.the("Boton para abrir formulario de Login").locatedBy("//a[contains(@data-ng-click ,'login')]");
	
	public static final Target MENU = Target.the("Menu principal").locatedBy("//header//ul//li[@class = 'nav-li-Links']");
	
	public static final Target PRODUCTOS = Target.the("Categoria de productos").locatedBy("//div[@class= 'container ']//div[@id]");
	
	public static final Target BANNER = Target.the("Categoria de productos").locatedBy("//div[@class='slider']");
	
	public static final Target INPUT_BUSQUEDA = Target.the("Campo de busqueda").locatedBy("//input[@id = 'autoComplete']");
	
	public static final Target BOTON_BUSQUEDA = Target.the("Icono de busqueda").locatedBy("//div[@id = 'searchSection']");
	
	public static final Target VENTANA_BUSQUEDA = Target.the("Ventana con los productos de la busqueda").locatedBy("//div[@class = 'top6Products']//p[@class = 'roboto-regular ng-binding']");
	
	public static final Target VENTANA_CATEGORIAS = Target.the("Ventana con las categorias de la busqueda").locatedBy("//div[@class = 'categories']//label");
	
	public static final Target MENSAJE_NO_RESULT = Target.the("Mensaje al no encontrar resultados").locatedBy("//span[@class = 'ng-binding']");
	
	public static final Target USUARIO = Target.the("Nombre de usuario logueado").locatedBy("//header//span[@data-ng-show='userCookie.response']");
	
	public static final Target CERRAR_SESION = Target.the("Link para cerrar sesion").locatedBy("//li//label[@translate=\"Sign_out\"]");
	
	public static final Target INPUT_LOGIN = Target.the("Campo de ingreso de usuario y password").locatedBy("//input[@name = '{0}']");
	
	public static final Target BOTON_LOGUEO = Target.the("Boton para iniciar sesion").locatedBy("//button[@id = 'sign_in_btnundefined']");
	
	public static final Target ADVERTENCIA = Target.the("Mensaje de advertencia de login fallido").locatedBy("//label[@id = 'signInResultMessage']");
	
	public static final Target LINK_Cuenta = Target.the("Link para ver la informacion de la cuenta").locatedBy("//header//label[@translate='My_account']");
}
