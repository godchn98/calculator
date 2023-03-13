package com.calculator.calculator;

import com.calculator.calculator.calculate.PositiveNumber;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+") {
        @Override
        public int arithmeticCalculate(int opperend1, int opperend2) {
            return opperend1 + opperend2;
        }
    },
    SUBTRACTION("-") {
        @Override
        public int arithmeticCalculate(int opperend1, int opperend2) {
            return opperend1 - opperend2;
        }
    },
    MULTIPLICATION("*") {
        @Override
        public int arithmeticCalculate(int opperend1, int opperend2) {
            return opperend1 * opperend2;
        }
    },
    DIVISION("/") {
        @Override
        public int arithmeticCalculate(int opperend1, int opperend2) {
            return opperend1 / opperend2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int arithmeticCalculate(final int opperend1, final int opperend2);


    public static int calculate(int operend1, String operator, int operend2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not valid calculation"));

        return arithmeticOperator.arithmeticCalculate(operend1, operend2);
    }


}


