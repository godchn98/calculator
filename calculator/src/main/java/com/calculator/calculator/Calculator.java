package com.calculator.calculator;

public class Calculator {
    public static int calculate(int operend1, String operator, int operend2) {
        return ArithmeticOperator.calculate(operend1, operator, operend2);


//        int result = switch (operator) {
//            case "+" -> operend1 + operend2;
//            case "-" -> operend1 - operend2;
//            case "*" -> operend1 * operend2;
//            case "/" -> operend1 / operend2;
//            default -> 0;
//        };
//        return result;
    }
}
