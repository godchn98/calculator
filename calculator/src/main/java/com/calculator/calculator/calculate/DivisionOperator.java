package com.calculator.calculator.calculate;

import com.calculator.calculator.NewArithmeticOperator;

public class DivisionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(int operend1, int operend2) {
        if(operend2 == 0) {
            throw new IllegalArgumentException("Can not divide to 0");
        }
        return operend1/operend2;
    }
}
