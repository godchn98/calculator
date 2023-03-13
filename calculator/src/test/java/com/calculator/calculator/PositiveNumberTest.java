package com.calculator.calculator;

import com.calculator.calculator.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class PositiveNumberTest {

    @DisplayName("Positive Number Test")
    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void createTest() {
        assertThatCode(() -> new PositiveNumber(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("number should be higher than 0");
    }
}
