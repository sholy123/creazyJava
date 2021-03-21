package com.sholy.chapter6;

public class PrintCommand implements Command{

    @Override
    public void process(int[] target) {
        for(int tmp : target){
            System.out.println("this is int num: "+tmp);
        }
    }
}
