package com.calculator.calculator.calculator.domain;

import com.calculator.calculator.calculator.domain.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operend1, PositiveNumber operend2);
}
