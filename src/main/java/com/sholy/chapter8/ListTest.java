package com.sholy.chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List books = new ArrayList();
        books.add("123");
        books.add("234");
        books.add("2345");
        System.out.println(books);

//        books.add(1, "1234");
        books.add(1,new String("1234"));
        for (int i =0 ;i <  books.size(); i++){
            System.out.println(books.get(i));
        }

        books.remove(0);
        System.out.println(books);
    }

}
