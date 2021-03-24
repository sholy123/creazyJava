package com.sholy.chapter6;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.MonthDay;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewDatePackageTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());

        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        Duration duration = Duration.ofSeconds(6000);
        System.out.println("6000s equals " + duration.getSeconds());
        System.out.println(duration.toHours());
        System.out.println(duration.toDays());
        System.out.println(duration.toMinutes());

        Instant instant = Instant.now();
        System.out.println(instant);

        MonthDay monthDay = MonthDay.now();
        System.out.println(monthDay);

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaab");
        System.out.println(m.matches());

    }
}
