package com.epam.task1.service;

import com.epam.task1.entity.Number;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void testCountLastDigitOfSquare() {
        Number number = new Number(9);
        NumberService numberService = new NumberService();
        Assert.assertEquals(1, numberService.countLastDigitOfSquare(number));
    }
}