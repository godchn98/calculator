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

}
