package com.epam.task4.service;

import com.epam.task4.entity.NumberSequence;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberSequenceServiceTest {

    @Test
    public void testIsTwoEwen() {
        NumberSequence numberSequence = new NumberSequence(5, 12, 14, 8);
        NumberSequenceService numSequenceService = new NumberSequenceService();
        Assert.assertEquals(true, numSequenceService.isTwoEwen(numberSequence));
    }
}