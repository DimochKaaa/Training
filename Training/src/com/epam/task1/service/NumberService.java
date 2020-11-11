package com.epam.task1.service;

import com.epam.task1.entity.Number;

public class NumberService {
    public int countLastDigitOfSquare(Number number) {
        return (number.getNumber() * number.getNumber()) % 10;
    }
}
