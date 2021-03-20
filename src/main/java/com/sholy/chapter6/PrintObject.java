package com.sholy.chapter6;

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

public class PrintObject {
    public static void main(String[] args) {
        Person person = new Person("zhangsan");
        System.out.println(person);
    }

}
