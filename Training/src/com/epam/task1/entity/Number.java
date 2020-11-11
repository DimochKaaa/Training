package com.epam.task1.entity;

public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Number{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
