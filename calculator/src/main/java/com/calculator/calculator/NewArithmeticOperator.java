package com.calculator.calculator;

import com.calculator.calculator.calculate.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operend1, PositiveNumber operend2);
}
