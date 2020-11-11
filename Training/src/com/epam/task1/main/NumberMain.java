package com.epam.task1.main;

import com.epam.task1.entity.Number;
import com.epam.task1.report.NumberReport;
import com.epam.task1.service.NumberService;

public class NumberMain {
    public static void main(String[] args) {
        Number num = new Number(17);
        NumberService numService = new NumberService();
        NumberReport numReport = new NumberReport();
        numReport.reportLastDigitOfSquare(num, numService.countLastDigitOfSquare(num));
    }
}
