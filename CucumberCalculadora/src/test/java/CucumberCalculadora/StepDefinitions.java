package CucumberCalculadora;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

	private double resultado;
	private boolean resultadoBoolean;
	private Calculadora c;

	@Given("a probar la calculadora")
	public void probar_calculadora() {
		c = new Calculadora();
	}

	@When("realizamos la suma de {double} más {double}")
	public void realizamos_la_suma_de_más(Double double1, Double double2) {
		// Write code here that turns the phrase above into concrete actions
		resultado = c.suma(double1, double2);
	}

	@When("realizamos la resta {double} menos {double}")
	public void realizamos_la_resta_menos(Double double1, Double double2) {
		// Write code here that turns the phrase above into concrete actions
		resultado = c.resta(double1, double2);
	}

	@When("realizamos el factorial de {int}")
	public void realizamos_el_factorial_de(int int1) {
		// Write code here that turns the phrase above into concrete actions
		resultado = c.fact(int1);
	}

	@When("realizamos la división {double} entre {double}")
	public void realizamos_la_división_entre(Double double1, Double double2) {
		// Write code here that turns the phrase above into concrete actions
		resultado = c.divide(double1, double2);
	}

	@When("volviendo a dividir el resultado anterior por {double}")
	public void volviendo_a_dividir_el_resultado_anterior_por(Double double1) {
		// Write code here that turns the phrase above into concrete actions
		resultado = c.divide(resultado, double1);
	}

	@When("quiero saber si el {int} es primo")
	public void quiero_saber_si_el_es_primo(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		resultadoBoolean = c.esPrimo(int1);
	}

	@When("realizamos la multiplicación {double} por {double}")
	public void realizamos_la_multiplicación_por(Double double1, Double double2) {
		// Write code here that turns the phrase above into concrete actions
		resultado = c.mult(double1, double2);
	}

	@When("y no tenemos en cuenta que no se puede dividir por cero")
	public void y_no_tenemos_en_cuenta_que_no_se_puede_dividir_por_cero() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("tengo valores positivos y negativos")
	public void tengo_valores_positivos_y_negativos() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("y no tenemos en cuenta que no se puede obtener el factorial de un número negativo")
	public void y_no_tenemos_en_cuenta_que_no_se_puede_obtener_el_factorial_de_un_número_negativo() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("el factorial de {int} debe de lanzar un aviso")
	public void el_factorial_de_debe_de_lanzar_un_aviso(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertThrows(IllegalStateException.class, () -> c.fact(int1));
	}

	@Then("quiero saber si el {int} es primo el resultado debe ser True")
	public void quiero_saber_si_el_es_primo_el_resultado_debe_ser_true(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(c.esPrimo(int1));
	}

	@Then("quiero saber si el {int} es primo el resultado debe ser excp")
	public void quiero_saber_si_el_es_primo_el_resultado_debe_ser_excp(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertThrows(IllegalStateException.class, () -> c.esPrimo(int1));
	}

	@Then("quiero saber si el {int} es primo el resultado debe ser False")
	public void quiero_saber_si_el_es_primo_el_resultado_debe_ser_false(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertFalse(c.esPrimo(int1));
	}

	@Then("si la división {double} entre {double} debe de lanzar un aviso")
	public void si_la_división_entre_debe_de_lanzar_un_aviso(Double double1, Double double2) {
		// Write code here that turns the phrase above into concrete actions
		assertThrows(ArithmeticException.class, () -> c.divide(double1, double2));
	}

	@Then("el resultado debe ser False")
	public void el_resultado_debe_ser_false() {
		// Write code here that turns the phrase above into concrete actions
		assertFalse(resultadoBoolean);
	}

	@Then("el resultado debe ser True")
	public void el_resultado_debe_ser_true() {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(resultadoBoolean);
	}

	@Then("el resultado debe ser {int}")
	public void el_resultado_debe_ser(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(int1.floatValue(), resultado);
	}

	@Then("el resultado deber ser {double}")
	public void el_resultado_deber_ser(Double double1) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(double1, resultado);
	}

	@Then("el resultado debe ser {double}")
	public void el_resultado_debe_ser(Double double1) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(double1, resultado);
	}

	// @Then("se debe de lanzar una excepción aritmetica")
	public void se_debe_lanzar_una_excepción_aritmentica() {
		// Write code here that turns the phrase above into concrete actions
		// assertThrows(ArithmeticException.class, () -> c.divide(resultado,
		// resultado));
	}

}
