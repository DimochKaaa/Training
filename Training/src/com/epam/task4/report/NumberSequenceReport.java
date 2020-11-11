package com.epam.task4.report;

import com.epam.task4.entity.NumberSequence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NumberSequenceReport {
    public void reportIsTwoEwenNums(NumberSequence numberSequence, boolean isTwoEvenNums) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(numberSequence.toString()
                            + "\nПоследовательность имеет два и более четных числа: " + isTwoEvenNums + "\n\n");
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
