package com.epam.task4.entity;

import java.util.Arrays;

public class NumberSequence {
    int[] numbers;

    public NumberSequence(int... numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberSequence{");
        sb.append("numbers=").append(Arrays.toString(numbers));
        sb.append('}');
        return sb.toString();
    }
}
