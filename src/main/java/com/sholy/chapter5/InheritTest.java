package com.sholy.chapter5;

class Animal{

    private void beat(){
        System.out.println("heart dong dong dong !!!");
    }
    public void breath(){
        beat();
        System.out.println("breathing ...... ");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("bird can fly!!!");
    }

    @Override
    public void breath(){
        System.out.println("bird breath use mouth!!!");
    }
}
class Wolf extends Animal{
    public void run(){
        System.out.println("wolf can run!!!");
    }

    @Override
    public void breath(){
        System.out.println("wolf breath use lung!!!");
    }
}

public class InheritTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.breath();
        bird.fly();
        Wolf wolf = new Wolf();
        wolf.run();
        wolf.breath();
    }

}
