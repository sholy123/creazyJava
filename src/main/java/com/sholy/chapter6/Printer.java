package com.sholy.chapter6;

interface Product{
    int MAX_CACHE_SIZE = 10;
    int getProduceName();
}

public class Printer implements Product{
    private String[] printData = new String[MAX_CACHE_SIZE];

    private int dataNum = 0;

    public void out(){
        while (dataNum > 0){
            System.out.println("dayin " + printData[0]);
            System.arraycopy(printData, 1, printData, 0,--dataNum);
        }
    }
    public void getData(String msg){
        if(dataNum >= MAX_CACHE_SIZE){
            System.out.printf("full!!");
        }else{
            printData[dataNum++] = msg;
        }
    }

    @Override
    public int getProduceName() {

        return 45;
    }

}
