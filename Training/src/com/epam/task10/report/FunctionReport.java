package com.epam.task10.report;

import com.epam.task10.entity.Function;
import com.epam.task9.entity.Circle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FunctionReport {
    public void reportFunctionValues(Function function, String values) {
        File file = new File(".//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(function.toString()  + "\n" + values + "\n\n");
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
