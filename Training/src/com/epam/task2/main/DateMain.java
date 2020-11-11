package com.epam.task2.main;

import com.epam.task2.entity.Date;
import com.epam.task2.report.DateReport;
import com.epam.task2.service.DateService;


public class DateMain {
    public static void main(String[] args) {
        Date date = new Date(5, 2012);
        DateService dataService = new DateService();
        int numberOfDays = dataService.countDaysInMonth(date);
        DateReport dateReport = new DateReport();
        dateReport.reportNumberOfDaysInMonth(date, numberOfDays);
    }
}
