package com.sholy.chapter7;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SimpleDateTest  {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年终的第D天");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);

//        String str = "21###3月##21";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y###MMM##d");
//        System.out.println(simpleDateFormat.parse(str));

        DateTimeFormatter[] dateTimeFormatters = new DateTimeFormatter[]{
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME
        };

        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);


        String str1 = "2014==04==12 01时06分09秒";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
        LocalDateTime localDateTime = LocalDateTime.parse(str1,formatter);
        System.out.println(localDateTime);


    }
}
