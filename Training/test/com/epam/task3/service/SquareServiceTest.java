package com.epam.task3.service;

import com.epam.task3.entity.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareServiceTest {

    @Test
    public void testCalculateSizeDifference() {
        Square square1 = new Square(25);
        Square square2 = new Square(100);
        SquareService squareService = new SquareService();
        Assert.assertEquals(4.0, squareService.calculateSizeDifference(square1, square2));
    }
}