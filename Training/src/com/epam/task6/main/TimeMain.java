package com.epam.task6.main;

import com.epam.task6.entity.Time;
import com.epam.task6.report.TimeReport;
import com.epam.task6.service.TimeService;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(15764);
        TimeService timeService = new TimeService();
        TimeReport timeReport = new TimeReport();
        String formatTime = timeService.formatTime(time);
        timeReport.reportFormatTime(time, formatTime);
    }
}
