package com.sholy.chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("!!!44444");
        arrayList.add("DDD");
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        arrayList.removeIf(obj -> obj.length() > 5);
        System.out.println(arrayList.size());
    }
}
