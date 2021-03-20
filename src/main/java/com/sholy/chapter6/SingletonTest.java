package com.sholy.chapter6;

class Singleton{

    private static Singleton instance;
    private final static int age = 4;

    private Singleton(){};

    public static Singleton getInstance(){

        if (instance == null){
            instance = new  Singleton();
        }
        return instance;
    }

}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
