@Youtube
Feature: Login en youtube

  @regresionYoutube
  Scenario: Buscar la cancion Locked out of heaven en la página de youtube
    Given AutomationIA requiero ingresar a youtube
    When la pagina sea visible buscar la cancion Locked out of heaven
    Then debera validar el titulo de la cancion

  @regresionYoutube
  Scenario: Creación de una cuenta en youtube
    Given AutomationIA requiero ingresar a youtube
    When la pagina sea visible acceder al fomulario para crear la cuenta
    Then debera quedar la cuenta creada

