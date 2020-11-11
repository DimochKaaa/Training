package com.epam.task5.report;

import com.epam.task4.entity.NumberSequence;
import com.epam.task5.entity.Number;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NumberReport {
    public void reportIsNumberPrefect(Number number, boolean isPerfect) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(number.toString() + "\nЧисло является совершенным: " + isPerfect + "\n\n");
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
