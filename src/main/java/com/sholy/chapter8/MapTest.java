package com.sholy.chapter8;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("1","123");
        map.put("2","234");
        map.put("3","345");

        System.out.println(map);

        System.out.println(map.containsKey("1"));

        System.out.println(map.get("2"));

        for (Object key : map.keySet()){
            System.out.println(map.get(key));
        }

        map.forEach((k,v) -> {
                    String name = (String)map.get(k);
                    System.out.println(k);
                    System.out.println(map.get(k));


        }
        );


    }


}
