package com.epam.task9.service;

import com.epam.task9.entity.Circle;

public class CircleService {
    public double circleSquare(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public double circleLength(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
}
