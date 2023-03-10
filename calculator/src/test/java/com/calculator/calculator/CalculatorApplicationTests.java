package com.calculator.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CalculatorApplicationTests {

	@DisplayName("add test")
	@Test
	void additionTest() {
		int result =  Calculator.calculate(1, "+", 2);

		assertThat(result).isEqualTo(3);
	}

	@DisplayName("subtract test")
	@Test
	void subtractionTest() {
		int result =  Calculator.calculate(3, "-", 2);

		assertThat(result).isEqualTo(1);
	}

	@DisplayName("multiply test")
	@Test
	void multiplyTest() {
		int result =  Calculator.calculate(4, "*", 2);

		assertThat(result).isEqualTo(8);
	}

	@DisplayName("divide test")
	@Test
	void divisionTest() {
		int result =  Calculator.calculate(10, "/", 2);

		assertThat(result).isEqualTo(5);
	}

}
