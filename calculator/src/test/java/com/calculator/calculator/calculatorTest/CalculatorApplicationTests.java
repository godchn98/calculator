package com.calculator.calculator.calculatorTest;

import com.calculator.calculator.calculator.domain.Calculator;
import com.calculator.calculator.calculator.domain.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@SpringBootTest
class CalculatorApplicationTests {

	@DisplayName("calculator test")
	@ParameterizedTest
	@MethodSource("formulaAndResult")
	void calculateTest(int operend1, String operator, int operend2, int result) {
		int calculateResult = Calculator.calculate(new PositiveNumber(operend1), operator, new PositiveNumber(operend2));

		assertThat(calculateResult).isEqualTo(result);
	}

	private static Stream<Arguments> formulaAndResult() {
		return Stream.of(
				arguments(1, "+", 2, 3),
				arguments(4, "-", 2, 2),
				arguments(2, "*", 4, 8),
				arguments(10, "/", 5, 2)
		);
	}

//	@DisplayName("Division exception test")
//	@Test
//	void calculateExceptionTest () {
//		assertThatCode(() -> Calculator.calculate(new PositiveNumber(1), "/", new PositiveNumber(0)))
//				.isInstanceOf(IllegalArgumentException.class)
//				.hasMessage("Can not divide to 0");
//	}


//	@DisplayName("add test")
//	@Test
//	void additionTest() {
//		int result =  Calculator.calculate(1, "+", 2);
//
//		assertThat(result).isEqualTo(3);
//	}
//
//	@DisplayName("subtract test")
//	@Test
//	void subtractionTest() {
//		int result =  Calculator.calculate(3, "-", 2);
//
//		assertThat(result).isEqualTo(1);
//	}
//
//	@DisplayName("multiply test")
//	@Test
//	void multiplyTest() {
//		int result =  Calculator.calculate(4, "*", 2);
//
//		assertThat(result).isEqualTo(8);
//	}
//
//	@DisplayName("divide test")
//	@Test
//	void divisionTest() {
//		int result =  Calculator.calculate(10, "/", 2);
//
//		assertThat(result).isEqualTo(5);
//	}

}
