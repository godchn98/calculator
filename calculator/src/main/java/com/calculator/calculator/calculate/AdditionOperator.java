package com.calculator.calculator.calculate;

import com.calculator.calculator.NewArithmeticOperator;

public class AdditionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operend1, PositiveNumber operend2) {
        return operend1.toInt() + operend2.toInt();
    }
}
