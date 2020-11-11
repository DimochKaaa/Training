package com.epam.task2.service;

import com.epam.task2.entity.Date;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateServiceTest {

    @Test
    public void testCountDaysInMonth() {
        Date date = new Date(2, 2012);
        DateService dateService = new DateService();
        Assert.assertEquals(28, dateService.countDaysInMonth(date));
    }
}