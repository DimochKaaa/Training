package com.epam.task5.service;

import com.epam.task5.entity.Number;

public class NumberService {
    public boolean isPrefectNumber(Number number) {
        int num = number.getNumber();
        int sum = 1;
        for(int i = 2; i < num / 2 + 1; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
}
