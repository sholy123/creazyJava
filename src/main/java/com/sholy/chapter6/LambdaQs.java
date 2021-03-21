package com.sholy.chapter6;

interface Eatable{
    void taste();
}
interface Flyable{
    void fly(String werther);
}
interface Addable{
    int add(int a, int b);
}

public class LambdaQs {
    public void eat(Eatable eatable){
        System.out.println("this is eat func!!");
        eatable.taste();
    }

    public void drive(Flyable flyable){
        System.out.println("this is fly func!!!");
        flyable.fly("fly!!!!!");
    }

    public void test(Addable addable){
        System.out.println("add func is " + addable.add(5,6));
    }

    public static void main(String[] args) {
        LambdaQs lambdaQs = new LambdaQs();
        lambdaQs.eat(() -> System.out.println("apple is good!!!"));

        lambdaQs.drive(werther -> {
            System.out.println("today weather " + werther);
        });
        lambdaQs.test(((a, b) -> {return a + b;}));

    }
}
