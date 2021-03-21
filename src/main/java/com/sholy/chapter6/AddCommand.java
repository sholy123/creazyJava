package com.sholy.chapter6;

public class AddCommand implements Command{

    @Override
    public void process(int[] target) {
        for(int tmp : target){
            tmp += 10;
            System.out.printf("add num is : " + tmp);
        }
    }
}
