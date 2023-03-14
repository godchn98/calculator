package com.calculator.calculator.calculator.domain;

public class PositiveNumber {
    private final  int value;


    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if(notPositiveNumber(value)) {
            throw new IllegalArgumentException("number should be higher than 0");
        }
    }

    private boolean notPositiveNumber(int value) {
        return value <= 0;
    }

    public int toInt() {
        return value;
    }
}
