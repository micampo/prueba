
@Wikipedia
Feature: Ingreso a wikipedia

  @regresionWikipedia
  Scenario: ingresar a la pagina de wikipedia para validar titulo de bienvenida
    Given AutomationIA requiero ingresar a wikipedia
    When la pagina muestre el letrero de bienvenida
    Then debera validar el titulo


  @regresionWikipedia
  Scenario: ingresar a la pagina de wikipedia para validar titulo de sistema CEEM
    Given AutomationIA requiero ingresar a wikipedia
    When ingreso la palabra sistema
    Then debera validar el titulo sistema ceem

  @regresionWikipedia
  Scenario: ingresar a la pagina de wikipedia para crear una cuenta
    Given AutomationIA requiero ingresar a wikipedia
    When ingreso a crear una cuenta con mi información
    Then deberia crear mi cuenta