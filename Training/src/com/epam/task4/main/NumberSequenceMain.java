package com.epam.task4.main;

import com.epam.task4.entity.NumberSequence;
import com.epam.task4.report.NumberSequenceReport;
import com.epam.task4.service.NumberSequenceService;

public class NumberSequenceMain {
    public static void main(String[] args) {
        NumberSequence numberSequence = new NumberSequence(8, 13, 15, 17);
        NumberSequenceService sequenceService = new NumberSequenceService();
        NumberSequenceReport sequenceReport = new NumberSequenceReport();
        boolean isTwoEwenNums = sequenceService.isTwoEwen(numberSequence);
        sequenceReport.reportIsTwoEwenNums(numberSequence, isTwoEwenNums);
    }
}
