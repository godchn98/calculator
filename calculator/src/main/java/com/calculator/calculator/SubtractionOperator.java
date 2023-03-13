package com.calculator.calculator;

public class SubtractionOperator implements NewArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(int operend1, int operend2) {
        return operend1 - operend2;
    }
}
