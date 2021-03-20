package com.sholy.chapter5;

import java.io.InputStreamReader;

public class Student {
    private String name;
    private int age;

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
    private String phone;
    private String address;
    private String email;
    
    public Student(){
        
    }
    public Student(String name, int age,String gender,String phone,String address,String email){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public void eat(){
        System.out.println(this.name + " is eating!!");
    }
    public void play(){
        System.out.println(this.name + " is playing!!");
    }
    public void drink(){
        System.out.println(this.name + " is drinking!!");
    }
    public void laugh(){
        System.out.println(this.name + " is laughing!!");
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("zhangsan",12,"nan","12345678","hebei","123@edu.cn"),
                new Student("zhangsan2",13,"nv","12345679","hebei","123@edu.cn"),
                new Student("zhangsan3",14,"nan","12345670","hebei","123@edu.cn"),
                new Student("zhangsan4",15,"nv","12345671","hebei","123@edu.cn")
        };

    }

}
