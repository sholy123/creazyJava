package com.sholy.chapter6;

class Out{
    class In{
        public In(String msg){
            System.out.println(msg);
        }
    }
}

public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("ceshi message");

    }
}
