package com.epam.task6.service;

import com.epam.task6.entity.Time;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeServiceTest {

    @Test
    public void testFormatTime() {
        Time time = new Time(3600);
        TimeService timeService = new TimeService();
        Assert.assertEquals("1 Ч 0 ММ 0 CC", timeService.formatTime(time));
    }
}