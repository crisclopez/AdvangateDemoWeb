Feature: Creacion de cuentas para usuarios nuevos
	Yo como administrador del portal DEMO necesito crear las cuentas de los nuevos usuarios para la  fidelización de los clientes y que estos puedan hacer sus compras online

  Scenario: Creacion de cuenta exitoso
    Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
    When el ingresa los campos requeridos 
    
    | Username | Password | Email             | Confirm password | First Name | Last Name | Phone Number | City     | Address        | State / Province / Region | Postal Code |
    | Alejjo   | Se12345  | coreo@hotmail.com | Se12345          | Sebastian  | Madrid    | 2326078      | Medellin | cll39A N 43-89 | San Diego                 | 151089      |
    
    And el selecciona el pais Colombia y acepta las politicas de privacidad
    And el crea la cuenta
    Then el vera su nombre de usuario Alejjo
    
    @tag1
  Scenario Outline: Validacion de obligatoriedad de los campos
    Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
    When el ingresa los campos requeridos
    
    | Username   | Password   | Email    | Confirm password   | First Name   | Last Name   | Phone Number   | City   | Address   | State / Province / Region   | Postal Code   |
    | <Username> | <Password> | <Email>  | <Confirm password> | <First Name> | <Last Name> | <Phone Number> | <City> | <Address> | <State / Province / Region> | <Postal Code> |
    
    And el selecciona el pais Colombia y acepta las politicas de privacidad
    
    Then El vera el boton Register deshabilitado
  
  Examples: 
  
    | Username | Password | Email             | Confirm password | First Name | Last Name | Phone Number | City     | Address        | State / Province / Region | Postal Code |
    |          | Se12345  | coreo@hotmail.com | Se12345          | Sebastian  | Madrid    | 2326078      | Medellin | cll39A N 43-89 | San Diego                 | 151089      |
    | sebaaas  |          | coreo@hotmail.com | Se12345          | Sebastian  | Madrid    | 2326078      | Medellin | cll39A N 43-89 | San Diego                 | 151089      |
    | sebaaas  | Se12345  |                   | Se12345          | Sebastian  | Madrid    | 2326078      | Medellin | cll39A N 43-89 | San Diego                 | 151089      |
    | sebaaas  | Se12345  | coreo@hotmail.com |                  | Sebastian  | Madrid    | 2326078      | Medellin | cll39A N 43-89 | San Diego                 | 151089      |
  
	Scenario Outline: Validacion de cantidad de caracteres en el campo Username
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
				
		Examples: 
		
		| campo        | dato_ingresado   | mensaje                   |
		| Username     | seb              | Use 4 character or longer |
		| Username     | sebastian madrid | Use maximum 15 character  |
	
	Scenario Outline: Validacion de cantidad de caracteres en el campo Password
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
				
		Examples: 
		
		| campo    | dato_ingresado   | mensaje                   |
		| Password | seb              | Use 4 character or longer |
		| Password | sebastian madrid | Use maximum 12 character  |
	
	Scenario: Validacion de la confirmacion del Password
		Given  que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo    | dato_ingresado |
		| Password | Sebas12*       |
		
		And el verifica un Password erroneo
		
		| campo            | dato_ingresado |
		| Confirm password | Sebas12*-      |
		
		Then el vera el mensaje de error
		
		| mensaje                | campo            |
		| Passwords do not match | Confirm password |
	
	Scenario Outline: Validacion del formato del Password
		Given  que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |

		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
		
	Examples: 
	
		| campo    | dato_ingresado | mensaje                        |
		| Password | sebas          | One upper letter required      |
		| Password | Sebas          | One number required            |
		| Password | Sebas1         | One special character required |
	
	Scenario Outline: Validacion de cantidad de caracteres en el campo Email
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
				
		Examples: 
		
		| campo | dato_ingresado                    | mensaje                  |
		| Email | sebastianmadridmorales@correo.com | Use maximum 15 character |
		
	Scenario Outline: Validacion de cantidad de caracteres en el campo First Name
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
		
		Examples: 
		
		| campo      | dato_ingresado                     | mensaje                   |
		| First Name | s                                  | Use 2 character or longer |
		| First Name | sebastian alejandro madrid morales | Use maximum 30 character  |
	
	Scenario Outline: Validacion de cantidad de caracteres en el campo Last Name
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
	
		Examples: 
		
		| campo        | dato_ingresado                     | mensaje                   |
		| Last Name    | s                                  | Use 2 character or longer |
		| Last Name    | sebastian alejandro madrid morales | Use maximum 30 character  |
	
	Scenario Outline: Validacion de cantidad de caracteres en el campo Phone Number
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
		
		Examples: 
		
		| campo        | dato_ingresado        | mensaje                  |
		| Phone Number | 123456789a123456789a1 | Use maximum 20 character | 
		
	Scenario Outline: Validacion de cantidad de caracteres en el campo City
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
		
		Examples: 
		
		| campo | dato_ingresado                  | mensaje                  |
		| City  | estaCiudadNoExisteEnElMundoReal | Use maximum 25 character |
		
	Scenario Outline: Validacion de cantidad de caracteres en el campo Address
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
	
		Examples: 
		
		| campo   | dato_ingresado                                      | mensaje                  |
		| Address | 123456789a123456789a123456789a123456789a123456789a1 | Use maximum 50 character | 
		
	Scenario Outline: Validacion de cantidad de caracteres en el campo State / Province / Region
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
	
		Examples: 
		
		| campo                     | dato_ingresado      | mensaje                  |
		| State / Province / Region | Antioquia la Grande | Use maximum 10 character | 
	
	Scenario Outline: Validacion de cantidad de caracteres en el campo Postal Code
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		When el ingresa informacion en el campo
		
		| campo   | dato_ingresado   |
		| <campo> | <dato_ingresado> |
		
		Then el vera el mensaje de error
		
		| mensaje   | campo   |
		| <mensaje> | <campo> |
		
		Examples: 
		
		| campo        | dato_ingresado | mensaje                        |
		| Postal Code  | 123456789xr    | Use maximum 10 character       |  
		| Postal Code  | @@@@@          | special characters not allowed | 
	
	Scenario: Validacion del campo Country
	  Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
	  When el selecciona a Colombia en la lista
	  Then el vera a Colombia en el campo

	Scenario: Verificacion de la seccion ACCOUNT DETAILS
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		Then el vera la seccion ACCOUNT DETAILS

	Scenario: Verificacion de la seccion PERSONAL DETAILS
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		Then el vera la seccion PERSONAL DETAILS

	Scenario: Verificacion de la seccion ADDRESS
		Given que el usuario se encuentra en la pagina de creacion de cuentas nuevas
		Then el vera la seccion ADDRESS
	
	