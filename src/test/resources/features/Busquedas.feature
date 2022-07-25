 Feature: Busquedas de productos usando el boton de SEARCH
 Yo como usuario de la pagina DEMO necesito una opcion de Buscar para poder hacer búsquedas de productos por palabras claves
 o referencias puntuales de productos tecnológicos
 
  Scenario: Verificacion del boton de busqueda de producto existente
    Given que el usuario se encuentra en la pagina de inicio del portal advantage
		Then entonces el vera el boton de busqueda
	
  Scenario: Validacion de la ventana de busqueda de producto existente
    Given que el usuario se encuentra en la pagina de inicio del portal advantage
    When el busca hp
    Then el vera una ventana con los articulos de la busqueda hp

  Scenario: Validacion de la categoria del producto buscado  de producto existente
    Given que el usuario se encuentra en la pagina de inicio del portal advantage
    When el busca hp
    Then el vera las categorias de los articulos mostrados en la busqueda
    
    | laptops | headphones | tablets | speakers | mice |
    
    Scenario: Validacion de busqueda de productos no existentes
    Given que el usuario se encuentra en la pagina de inicio del portal advantage
    When el busca xxx
    Then el vera el texto NO RESULTS
