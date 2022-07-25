Feature: Administracion de las cuentas de los usuarios
  Yo como usuario de la pagina DEMO necesito un icono de usuario para poder administrar mi cuenta

  Scenario: Logueo exitoso
    Given que el usuario se encuentra en la pagina de logueo
    When el ingresa las credenciales
    
    | username | password |
    | Zebas    | Se1234   | 
    
    Then el vera su usuario Zebas

  Scenario: Logueo fallido
    Given que el usuario se encuentra en la pagina de logueo
    When el ingresa las credenciales
    
    | username | password |
    | Zebas    | Se12345  | 
    
    Then el vera la advertencia Incorrect user name or password.

  Scenario: Validar datos de la cuenta
    Given que el usuario se encuentra en la pagina My Account
    
    | username | password  |
    | Zebas    | Se1234    | 
    
    Then el vera su informacion
    
    | Sebas tian | cll falsa N 1-2 | Bogota | Canada | Las Palmas | 151009 | 55555555 |
    
  Scenario Outline: Verificar  link de Editar datos de la cuenta
    Given que el usuario se encuentra en la pagina My Account
    
    | username | password  |
    | Zebas    | Se1234    | 
    
    Then el vera el link Edit de la <seccion>

	Examples: 
		
		| seccion |
		| Details |
		| Payment |
	

 	Scenario: Modificar datos de la cuenta
    Given que el usuario se encuentra en la pagina Account Details
    
    | username  | password  |
    | Zebaas    | Se1234    | 
    
    When el edita los campos 
    
    | Email              | First Name | Last Name | Phone Number | City     | Address         | State / Province / Region | Postal Code |
    | correo@hotmail.com | Sebas      | tian      | 55555555     | Bogota   | cll falsa N 1-2 | Las Palmas                | 151009      |
    
    And el modifica el campo Country por el valor Canada
    And el guarda los cambios
    
    Then el vera su informacion
    
    | Sebas tian | cll falsa N 1-2 | Bogota | Canada | Las Palmas | 151009 | 55555555 |
    

 	Scenario: Modificar password exitoso
 		Given que el usuario se encuentra en la pagina Account Details
 		
 		| username | password |
    | Zebass   | Se12345  |
 		
 		When el modifica su password Se12345 por Se1234
 		Then el vera el titulo MY ACCOUNT
 	


