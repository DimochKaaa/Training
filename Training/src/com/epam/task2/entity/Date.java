package com.epam.task2.entity;


public class Date {
    private int month;
    private int year;

    public Date(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Date{");
        sb.append("month=").append(month);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
