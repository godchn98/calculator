package com.calculator.calculator;

import com.calculator.calculator.calculate.AdditionOperator;
import com.calculator.calculator.calculate.DivisionOperator;
import com.calculator.calculator.calculate.MultiplyOperator;
import com.calculator.calculator.calculate.SubtractionOperator;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperaters = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplyOperator(), new DivisionOperator());

    public static int calculate(int operend1, String operator, int operend2) {
        return arithmeticOperaters.stream()
                .filter(arithmeticOperaters -> arithmeticOperaters.supports(operator))
                .map(arithmeticOperaters -> arithmeticOperaters.calculate(operend1, operend2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not Correct Value"));
    }


//    public static int calculate(int operend1, String operator, int operend2) {
//        return ArithmeticOperator.calculate(operend1, operator, operend2);
//
//
////        int result = switch (operator) {
////            case "+" -> operend1 + operend2;
////            case "-" -> operend1 - operend2;
////            case "*" -> operend1 * operend2;
////            case "/" -> operend1 / operend2;
////            default -> 0;
////        };
////        return result;
//    }
}
