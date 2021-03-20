package com.sholy.chapter5;

class Base{
    public Base(){
        test();
    }
    public void test(){
        System.out.println("this is base test");
    }

}

public class Sub extends Base {

    private static String name = " 1233";

    @Override
    public void test(){
        System.out.println("this is sub test!!!" + this.name.length());
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
    }

}
