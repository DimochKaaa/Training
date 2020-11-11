package com.epam.task2.report;

import com.epam.task2.entity.Date;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DateReport {
    public void reportNumberOfDaysInMonth(Date date, int numberOfDays) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(date.toString() + "\nКол-во дней в месяце: " + numberOfDays + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
