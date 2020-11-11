package com.epam.task4.service;

import com.epam.task4.entity.NumberSequence;

public class NumberSequenceService {
    public boolean isTwoEwen(NumberSequence numSequence) {
        int ewenCount = 0;
        for(int i : numSequence.getNumbers()) {
            if(i % 2 == 0) {
                if(ewenCount == 1) {
                    return true;
                }
                ++ewenCount;
            }
        }
        return false;
    }
}
