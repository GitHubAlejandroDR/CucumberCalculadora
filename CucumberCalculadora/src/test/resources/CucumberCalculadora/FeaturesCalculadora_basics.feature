@tag
Feature: Funcionamiento básico de las operaciones 
  Vamos a comprobar el funcionamiento básico de las operaciones de la calculadora si entrar a probar las propiedades matemáticas de cada una de ellas
  
  @ScenarioSuma
  Scenario: Suma de dos números positivos
    Given a probar la calculadora
    When realizamos la suma de 4.0 más 2.0 
    Then el resultado deber ser 6.0
    
   @ScenarioRestaPosDec 
   Scenario: Resta de dos números positivos con decimales
   	Given a probar la calculadora
   	When realizamos la resta 4.0 menos 2.0
   	Then el resultado debe ser 2.0
   	
   @ScenarioRestaPosNeg
   Scenario: Restar a un número positivo un número negativo 
   	Given a probar la calculadora
   	When realizamos la resta 2.0 menos 2.5
    Then el resultado debe ser -0.5
    
   @ScenarioMultiplicación
   Scenario: Multiplicar dos número positivos
   	Given a probar la calculadora
   	When realizamos la multiplicación 2.0 por 2.0
		Then el resultado debe ser 4.0
		
	@ScenarioDivisionesConsecutivas	
	Scenario: Realizar dos divisiones consecutivas
		Given a probar la calculadora
		When realizamos la división 8.0 entre 2.0
		And volviendo a dividir el resultado anterior por 2.0
		Then el resultado debe ser 2.0
		
		@ScenarioFactorial	
		Scenario: Realizar el factorial de 5
			Given a probar la calculadora
			When realizamos el factorial de 5
			Then el resultado debe ser 120.0
			
		@ScenarioPrimoTrue		
		Scenario: Probar que 5 es primo
			Given a probar la calculadora
			When quiero saber si el 5 es primo
			Then el resultado debe ser True
			
		@ScenarioPrimoFalse	
		Scenario: Probar que el 0 no es primo
			Given a probar la calculadora
			When quiero saber si el 0 es primo
			Then el resultado debe ser False
		
  @ScenarioSumaPosNeg_outline
  Scenario Outline: Suma de números negativos y positivos
    Given a probar la calculadora
    When realizamos la suma de <value1> más <value2>
    Then el resultado debe ser <status> 

    Examples: 
			| value1    | value2   | status    |
			|		-1.0		|    0.0   |   -1.0    |
      |		-1.0		|    7.0   |    6.0    |
 