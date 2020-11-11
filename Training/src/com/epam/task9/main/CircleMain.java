package com.epam.task9.main;

import com.epam.task9.entity.Circle;
import com.epam.task9.report.CircleReport;
import com.epam.task9.service.CircleService;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        CircleService circleService = new CircleService();
        CircleReport circleReport = new CircleReport();
        double circleSquare = circleService.circleSquare(circle);
        double circleLength = circleService.circleLength(circle);
        circleReport.reportCircleValues(circle, circleSquare, circleLength);
    }
}
