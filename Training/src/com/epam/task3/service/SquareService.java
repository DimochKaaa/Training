package com.epam.task3.service;

import com.epam.task3.entity.Square;

public class SquareService {
    public double calculateSizeDifference(Square square1, Square square2) {
        return (square1.getSquare() > square2.getSquare()) ? square1.getSquare() / square2.getSquare()
                                                               : square2.getSquare() / square1.getSquare();
    }
}
