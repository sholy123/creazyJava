package com.sholy.chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("sunwukong");
        collection.add(5);
        collection.remove(5);
        System.out.println(collection.size());

        System.out.println(collection.contains("sunwukong"));

        Collection c2 = new HashSet();
        c2.add("1");
        c2.add("2");
        System.out.println(c2.size());
        System.out.println(c2.contains("2"));

        c2.add("1");
        System.out.println(c2.size());
        c2.remove("1");
        System.out.println(c2.size());

        collection.forEach(obj -> System.out.println(obj));

    }
}
