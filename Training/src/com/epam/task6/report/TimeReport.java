package com.epam.task6.report;

import com.epam.task6.entity.Time;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TimeReport {
    public void reportFormatTime(Time time, String formatTime) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(time.toString()
                    + "\nОт начала суток прошло: " + formatTime + "\n\n");
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
