package com.epam.task5.service;

import com.epam.task5.entity.Number;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void testIsPrefectNumber() {
        Number number = new Number(28);
        NumberService numberService = new NumberService();
        Assert.assertEquals(true, numberService.isPrefectNumber(number));
    }
}