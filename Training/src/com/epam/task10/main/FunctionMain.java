package com.epam.task10.main;

import com.epam.task10.entity.Function;
import com.epam.task10.report.FunctionReport;
import com.epam.task10.service.FunctionService;

public class FunctionMain {
    public static void main(String[] args) {
        Function function = new Function(-15, 15, 1.5);
        FunctionService functionService = new FunctionService();
        FunctionReport functionReport = new FunctionReport();
        String values = functionService.functionValues(function);
        functionReport.reportFunctionValues(function, values);
    }
}
