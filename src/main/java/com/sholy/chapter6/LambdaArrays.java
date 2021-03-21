package com.sholy.chapter6;

import java.util.Arrays;

public class LambdaArrays {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"java", "c++","python","c#","php"};
        Arrays.parallelSort(arr1,(o1,o2)-> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr1));
    }
}
