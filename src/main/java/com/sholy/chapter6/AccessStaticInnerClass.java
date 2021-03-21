package com.sholy.chapter6;

public class AccessStaticInnerClass {

    private static class StaticInnerClass{
        private static int p1 = 5;
        private int p2 = 6;
    }

    public void test(){
        System.out.println(StaticInnerClass.p1);

        System.out.println(new StaticInnerClass().p2);
    }

}
