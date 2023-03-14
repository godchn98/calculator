package com.calculator.calculator.calculator.operator;

import com.calculator.calculator.calculator.domain.NewArithmeticOperator;
import com.calculator.calculator.calculator.domain.PositiveNumber;

public class SubtractionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operend1, PositiveNumber operend2) {
        return operend1.toInt() - operend2.toInt();
    }
}
