package com.sholy.chapter6;

public class CommandTest {
    public static void main(String[] args) {
        ProcssArray pa = new ProcssArray();
        int[] target = {1,3,1,2,4};
        pa.process(target,new PrintCommand());
        pa.process(target,new AddCommand());
    }
}
