package com.epam.task10.service;

import com.epam.task10.entity.Function;

public class FunctionService {
    public String functionValues(Function function) {
        double startingValue = function.getStartingValue();
        double finiteValue = function.getFiniteValue();
        double step = function.getStep();
        String str = "Значение аргумента\t|\tЗначение функции\n";
        for(double i = startingValue; i < finiteValue; i += step) {
            str += i + "\t\t\t|\t" + Math.tan(i) + "\n";
        }
        return str;
    }
}
