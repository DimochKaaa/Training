package com.epam.task5.main;

import com.epam.task5.entity.Number;
import com.epam.task5.report.NumberReport;
import com.epam.task5.service.NumberService;

public class NumberMain {
    public static void main(String[] args) {
        Number number = new Number(32);
        NumberService numService = new NumberService();
        NumberReport numReport = new NumberReport();
        boolean isPerfect = numService.isPrefectNumber(number);
        numReport.reportIsNumberPrefect(number, isPerfect);
    }
}
