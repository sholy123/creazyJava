package com.sholy.chapter3;

public class Numbers {
    public static void main(String[] args) {
        int age;
        String name = "ligang";
        String hello = "hello " + "Java!";

        System.out.println(hello);

        byte a = 56;
        long bigValue = 999999999999999999L;
        System.out.println(bigValue);

        int octalVal = 013;
        int hexValue = 0x13;
        System.out.println(octalVal+ "  "+ hexValue);

        int hexValue2 = 0xab;
        System.out.println(hexValue2);

        int binVal = 0b11000000;
        System.out.println(binVal);


        char aChar = 'a';
        char enterChar = '\r';
        System.out.println(enterChar);

        char ch = '\u9999';
        System.out.println(ch);


        float af = 5.123445556f;
        System.out.println(af);

        double b = 0.0;
        double c = Double.NEGATIVE_INFINITY;
        float d = Float.NEGATIVE_INFINITY;
        System.out.println(c == d);

        //非数之间是不等的
        System.out.println(b / b == Float.NaN);

        //所有的正无穷大都是相等的
        System.out.println( 1.0 / 0 == 555.0 / 0);
        //负数除以0得到负无穷大
        System.out.println( -8 / b);

//        System.out.println(0 / 0);

        boolean b1 = true;
        String a1 = b1 + "afa ";
        System.out.println(a1+ "     "+ b1);

        int q = 6;
        float f = q;
        System.out.println(f);

        byte n = 9;
        double dd = n;
        System.out.println(dd);

        String str1 = "7";

        String str2 = 3.5f + "hhhh";
        System.out.println(str2);

        System.out.println(3 + 4 + "helll");
        System.out.println("Numbers.main" + 4+ 3);

        int inta = 233;
        byte by = (byte)inta;
        System.out.println(by);


        String result = "";
        for(int i = 0; i < 6; i++){
            int intVal = (int)(Math.random() * 26 + 97);
            result = result + (char)intVal;
        }
        System.out.println(result);


        for(int i = 0; i < 10; i++){
            System.out.println((int)(Math.random()*26));
        }

        float floatl = 5.6f;
        System.out.println(floatl);

        System.out.println((char) (98));
        System.out.println((int)('A'));

        System.out.println('a' + 1 +"hell");

        short short1 = 5;

        String s0 = "hello";
        String s1 = "hello";
        String s2 = "he" + "llo";
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);

        double da = 2.3;
        double ba = Math.pow(da, 2);
        System.out.println(ba);

        System.out.println(Math.sqrt(5));

    }
}
