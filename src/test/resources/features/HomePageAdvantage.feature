Feature: Menu de Navegacion
  Yo como gerente de marketing DEMO quiero implementar un portal web en el que se exhiban diferentes productos de tecnología 
  por categoría para la compra de artículos online y muestre una barra de menu

  Scenario: Verificacion del menu de navegacion
    Given que el usuario se encuentra en la pagina de inicio del portal advantage
    Then el vera la barra de menu de navegacion
    
   		|CONTACT US | POPULAR ITEMS | SPECIAL OFFER | OUR PRODUCTS |

  Scenario: Verificacion de banner de publicidad
    Given que el usuario se encuentra en la pagina de inicio del portal advantage 
    Then el vera el banner de publicidad

  Scenario: Verificacion de las categorias
    Given que el usuario se encuentra en la pagina de inicio del portal advantage
    Then el vera las categorias de los productos
    
   		|SPEAKERS | TABLETS | LAPTOPS | MICE | HEADPHONES |
