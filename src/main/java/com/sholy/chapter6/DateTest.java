package com.sholy.chapter6;


import java.util.Calendar;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        Date d2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(d2);

        System.out.println(date.compareTo(d2));

        System.out.println(date.before(d2));

        Calendar calendar = Calendar.getInstance();

        Date date1 = calendar.getTime();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
    }

}
