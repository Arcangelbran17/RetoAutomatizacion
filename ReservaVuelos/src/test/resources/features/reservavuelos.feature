#Author: Edwin Arkangel Escobar Bran
# encoding:iso-8859-1

Feature: Reserva de vuelos nacionales colombia
  Yo como usuario, requiero reservar un vuelo nacional medellin - bogota, por la pagína de despegar.com satisfactoriamente.


  @tag2
  Scenario Outline: Validar la reserva del vuelo exitosamente.
    Given que me encuentro en el sitio web de despegar
    When ingreso los datos necesarios para la reserva del vuelo <origen>,<destino>,<fechaida>,<fechavuelta>,<totalpasajeroadulto>
    And selecciono el vuelo 
    Then puedo ver el mensaje de ¡falta poco! satisfactoriamente <mensaje> 

    Examples: 
      | origen    | destino     | fechaida   | fechavuelta   | totalpasajeroadulto |  mensaje |
      | Medellin  |  bogota     | 17         |  27           |      2              |¡Falta poco! Completa tus datos y finaliza tu compra |
