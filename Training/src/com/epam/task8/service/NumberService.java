package com.epam.task8.service;

import com.epam.task8.entity.Number;

public class NumberService {
    public double countFunction(Number number) {
        int num = number.getNumber();
        return num < 3 ? 1.0 / (Math.pow(num, 3) - 6) : -(Math.pow(num, 2)) + 3 * num + 9;
    }
}
