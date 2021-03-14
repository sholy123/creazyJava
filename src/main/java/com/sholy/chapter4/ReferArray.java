package com.sholy.chapter4;

public class ReferArray {
    public static void main(String[] args) {
        Person[] students;
        students = new Person[2];
        Person zhang = new Person();
        zhang.age = 23;
        zhang.height = 120;
        Person lee = new Person();
        lee.age = 12;
        lee.height = 145;
        students[0] = zhang;
        students[1] = lee;
        lee.info();
        students[1].info();
        students[1].age = 15;
        lee.info();
        students[1].info();
    }
}
