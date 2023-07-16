Feature: Realizar el cambio de locacion para el envio de los pedidos
  Scenario Outline: Cambio de locacion
    Given que se quiere asignar un municipio o ciudad para la pagina
    When se ingrese el "<departamento>" y la ciudad "<ciudad>"
    Then debe visualizarse correctamente la ciudad escogida en la pantalla principal
    Examples:
    |departamento|ciudad|
    |Antioquia|Otra Ciudad|
