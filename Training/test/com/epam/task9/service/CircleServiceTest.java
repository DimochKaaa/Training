package com.epam.task9.service;

import com.epam.task9.entity.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircleServiceTest {

    @Test
    public void testCircleSquare() {
        Circle circle = new Circle(9);
        CircleService circleService = new CircleService();
        Assert.assertEquals(254, (int)circleService.circleSquare(circle));
    }

    @Test
    public void testCircleLength() {
        Circle circle = new Circle(9);
        CircleService circleService = new CircleService();
        Assert.assertEquals(56, (int)circleService.circleLength(circle));
    }
}