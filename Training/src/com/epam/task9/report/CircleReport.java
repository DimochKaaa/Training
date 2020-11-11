package com.epam.task9.report;


import com.epam.task9.entity.Circle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CircleReport {
    public void reportCircleValues(Circle circle, double circleSquare, double circleLength) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(circle.toString()  + "\nПлощадь: " + circleSquare + "\nДлина: " + circleLength + "\n\n");
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
