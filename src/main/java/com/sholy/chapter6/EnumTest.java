package com.sholy.chapter6;

public class EnumTest {
    public void judge(SeasonEnum s){
        switch (s){
            case FALL:
                System.out.println("this is fall");
                break;
            case SPRING:
                System.out.println("this is spring");
                break;
            case SUMMER:
                System.out.println("this is summber!!");
                break;
            case WINTER:
                System.out.println("this is winter!!");
                break;
            default:
                System.out.println("this is not a season!!!");
        }
    }

    public static void main(String[] args) {
        for (SeasonEnum s: SeasonEnum.values()){
            System.out.println(s);
        }
        new EnumTest().judge(SeasonEnum.SPRING);
    }
}
