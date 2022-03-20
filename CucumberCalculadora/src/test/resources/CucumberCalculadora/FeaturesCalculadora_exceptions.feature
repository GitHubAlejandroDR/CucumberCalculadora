@tag
Feature: Comprobaremos el comportamiento de la calculadora en situaciones problemáticas esperandose que se lanze una excepción.
 
  
  @ScenarioCalculadoraDivCero
  Scenario: Como usuario quiero que la calculadora me avise cuando no puedo realizar un división por cero
    Given a probar la calculadora
    When y no tenemos en cuenta que no se puede dividir por cero
    Then si la división 8.0 entre 0.0 debe de lanzar un aviso


	@ScenarioCalculadoraFactNeg
  Scenario: Como usuario quiero que la calculadora me avise cuando pretendo obtener el factorial de un número negativo
    Given a probar la calculadora
		When y no tenemos en cuenta que no se puede obtener el factorial de un número negativo
    Then el factorial de -3 debe de lanzar un aviso

  @ScenarioCalculadoraPrimo_outline
  Scenario Outline: Como usuario pretendo saber si son primos ciertos números
    Given a probar la calculadora
		When tengo valores positivos y negativos
		Then quiero saber si el <value> es primo el resultado debe ser <result>

    Examples: 
      | value  | result | 
      | 0      |  False | 
      | 3      |   True | 
      | -1     |  excp  | 
     