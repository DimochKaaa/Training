package com.epam.task3.report;

import com.epam.task3.entity.Square;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SquareReport {
    public void reportDifferenceBetweenSquares(Square square1, Square square2, double difference) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(square1.toString() + " : " + square2.toString() + "\nРазница площадей: " + difference + " раз(а)\n\n");
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
