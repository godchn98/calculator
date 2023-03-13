package com.calculator.calculator;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(int operend1, int operend2);
}
