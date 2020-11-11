package com.epam.task6.service;

import com.epam.task6.entity.Time;

public class TimeService {
    public String formatTime(Time time) {
        int hours = time.getSeconds() / 3600;
        int minutes = (time.getSeconds() % 3600) / 60;
        int seconds = (time.getSeconds() % 3600) % 60;
        return "" + hours + " Ч " + minutes + " ММ " + seconds + " CC";
    }
}
