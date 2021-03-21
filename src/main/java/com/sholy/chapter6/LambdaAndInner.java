package com.sholy.chapter6;

@FunctionalInterface
interface Display{
    void display();
    default int add(int a, int b){
        return a + b;
    }
}
public class LambdaAndInner {
    private int age= 12;
    private static String name = "sholy";

    public void test(){
        String book = "java jiangxi!";
        Display dis = ()->{
            System.out.println("jububinaliang is " + book);
            System.out.println("waibulei shilibianliang is " + age);
            System.out.println("waibulei leibianliang is " + name);
        };
        dis.display();
        System.out.println(dis.add(3,6));
    }

    public static void main(String[] args) {
        LambdaAndInner lambdaAndInner = new LambdaAndInner();
        lambdaAndInner.test();
    }
}
