package com.epam.task3.main;

import com.epam.task3.entity.Circle;
import com.epam.task3.entity.Square;
import com.epam.task3.report.SquareReport;
import com.epam.task3.service.SquareService;

public class SquareMain {
    public static void main(String[] args) {
        Square square1 = new Square(64);
        Circle circle = new Circle(square1);
        Square square2 = new Square(2 * Math.pow(circle.getRadius(), 2));
        SquareService squareService = new SquareService();
        SquareReport squareReport = new SquareReport();
        double difference = squareService.calculateSizeDifference(square1, square2);
        squareReport.reportDifferenceBetweenSquares(square1, square2, difference);
    }
}
