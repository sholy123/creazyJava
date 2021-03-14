package com.sholy.chapter4;

import java.util.SplittableRandom;

public class TestArray {
    public static void main(String[] args) {
        int[] intarr;
        intarr = new int[]{1,2,3,4,5,6};
        Object[] objArr;
        objArr = new Object[]{"string", "java"};
        int[] a = { 1,2,3,4,5};
        int[] prices =  new int[5];
        String[] books = new String[4];
        Object[] address = new Integer[2];

        for(int i = 0; i < a.length; i ++){
            System.out.println(a[i]);
        }
        books[0] = "name";
        books[1] = "ligang";

        for(String book:books){
            System.out.println(book);
        }

        TestArray.testArray();
    }

    public static void testArray(){
        int[] a = {5,7,10};
        int[] b = new int[4];
        System.out.println("the length of b is " + b.length);
        for (int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        b = a;
        System.out.println("the length of b is " + b.length);
    }

    public static void testArray2(){
        int[] a = new int[5];
        for (int i = 0 ;i < 5; i ++){
            a[i] = i + 10;
        }
    }
}
