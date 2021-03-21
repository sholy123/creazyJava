package com.sholy.chapter6;

class StaticOut{
    static class StaticIn{
        public StaticIn(){
            System.out.println("static inner class!!");
        }
    }
}

public class CreateStaticInnerInstance {
    public static void main(String[] args) {
        StaticOut.StaticIn in = new StaticOut.StaticIn();
    }
}
