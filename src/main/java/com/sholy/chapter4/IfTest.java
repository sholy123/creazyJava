package com.sholy.chapter4;

public class IfTest {
    public static void main(String[] args) {
        char score = 'C';
        switch (score){
            case 'A':
                System.out.println("great");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("less good!");
                break;
            case 'D':
                System.out.println("bad!!");
                break;
            case 'E':
                System.out.println("very bad!!!");
                break;
            default:
                System.out.println("ERROR!!!");
        }

//        IfTest.testWhile();
//        IfTest.testFor();
        IfTest.testBreak();
    }

    public static void  testWhile(){
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count ++ ;
        }
//        do{
//            System.out.println(count);
//            count--;
//        }while (count >0);
    }

    public static void testFor(){
        for(int count = 0; count < 10; count ++){
            if(count == 5){
                System.out.println("this is 555555");
//                break;
                return;
            }
            System.out.println(count);
        }
    }


    public static void testBreak(){
//        for (int i =0 ; i <10; i++){
//            System.out.println("ooooooo " + i);
//            if (i == 2){
//                System.out.println("the value of i is " +i);
//                break;
//            }
//        }
        outer:
        for(int i = 0; i < 10;i++){
            for(int j = 0; j < 10;j++){
                System.out.println("the value of i is " + i);
                if(j == 1){
                    break outer;
                }
            }
        }
    }

}
