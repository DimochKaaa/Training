package com.epam.task8.service;

import com.epam.task8.entity.Number;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void testCountFunction() {
        Number number = new Number(1);
        NumberService numberService = new NumberService();
        Assert.assertEquals(-0.2, numberService.countFunction(number));
    }
}