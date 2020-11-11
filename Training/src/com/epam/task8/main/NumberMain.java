package com.epam.task8.main;

import com.epam.task8.entity.Number;
import com.epam.task8.report.NumberReport;
import com.epam.task8.service.NumberService;

public class NumberMain {
    public static void main(String[] args) {
        Number number = new Number(1);
        NumberService numService = new NumberService();
        NumberReport numReport = new NumberReport();
        double functionValue = numService.countFunction(number);
        numReport.reportFunctionValue(number, functionValue);
    }
}
