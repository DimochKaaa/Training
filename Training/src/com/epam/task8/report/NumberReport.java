package com.epam.task8.report;

import com.epam.task8.entity.Number;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NumberReport {
    public void reportFunctionValue(Number number, double functionValue) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(number.toString() + "\nЗначение функции:  " + functionValue + "\n\n");
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
