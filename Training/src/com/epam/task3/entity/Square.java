package com.epam.task3.entity;

public class Square {
    private double numberSquare;

    public Square(double numberSquare) {
        this.numberSquare = numberSquare;
    }

    public double getSquare() {
        return numberSquare;
    }

    public void setSquare(double numberSquare) {
        this.numberSquare = numberSquare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("numberSquare=").append(numberSquare);
        sb.append('}');
        return sb.toString();
    }
}
