package com.sholy.chapter6;

public class EqualTest {

    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println(it == fl);

        char ch = 'A';
        System.out.println(ch == it);

        String str1 = "hello";
        String str2 = "hello";

        System.out.println(str1 == str2);

    }

}
