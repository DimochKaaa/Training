package com.epam.task2.service;

import com.epam.task2.entity.Date;

public class DateService {
    public int countDaysInMonth(Date date) {
        if(date.getMonth() == 2) {
            return (date.getYear() % 4 == 0) ? 28 : 27;
        }
        return (date.getMonth() < 8) ? 30 + (date.getMonth() + 2) % 2 : 30 + (date.getMonth() + 1) % 2;
    }
}
