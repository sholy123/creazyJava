package com.sholy.chapter6;

public class Person2 {
    private String name;
    private String idStr;

    public Person2(String name,String idStr){
        this.idStr = idStr;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj != null && obj.getClass() == Person2.class){
            Person2 person2 = (Person2) obj;
            if(person2.idStr.equals(this.idStr)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Person2 p1 = new Person2("1","123");
        Person2 p2 = new Person2("2","123");
        System.out.println(p1.equals(p2));
    }

}
