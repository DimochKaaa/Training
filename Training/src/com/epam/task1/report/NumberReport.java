package com.epam.task1.report;


import com.epam.task1.entity.Number;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NumberReport {
    public void reportLastDigitOfSquare(Number number, int lastDigitOfSquare) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(number.toString() + "\nПоследняя цифра квадрата числа:  " + lastDigitOfSquare + "\n\n");
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
