package com.sholy.chapter6;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String str = "heloo 13031232134 ,," + "my phone num is 13556788234";
        Matcher matcher = Pattern.compile("((13\\d)|(15\\d)\\d{8})").matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
