package com.epam.task3.entity;

public class Circle {
    private double radius;

    public Circle(Square square) {
        this.radius = Math.sqrt(square.getSquare());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
