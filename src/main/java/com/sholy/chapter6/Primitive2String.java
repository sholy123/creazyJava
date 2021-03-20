package com.sholy.chapter6;

import java.io.InputStreamReader;

public class Primitive2String {

    public static void main(String[] args) {
        String insStr = "123";

        int it1 = Integer.parseInt(insStr);
        int it2 = Integer.valueOf(insStr);

        System.out.println(it2);

        String floatStr = "2.34";

        float ft1 = Float.valueOf(floatStr);
        float ft2 = Float.parseFloat(floatStr);

        System.out.println(ft2 + "  " + ft1);

        String ftStr = String.valueOf(2.345f);

        System.out.println(ftStr);

        System.out.println(Integer.valueOf(it1) == Integer.valueOf(it2));

        Integer a = new Integer(5);
        Integer b = new Integer(5);
        System.out.println(a == b);
        System.out.println(a.intValue() == b.intValue());
    }
}
