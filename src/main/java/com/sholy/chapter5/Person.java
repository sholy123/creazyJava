package com.sholy.chapter5;

public class Person {



    public Person(){
        System.out.println("this is conc!!!");
    }

    static  {
        int a = 6;
        if(a > 4){
            System.out.println("person has a number ---a , and a bigger than 4!!!");
        }
    }

    {
        System.out.println("this is second block!!");
    }

    public static void main(String[] args) {
//        Person person ;
//        person = new Person();
        new Person();
    }

}
