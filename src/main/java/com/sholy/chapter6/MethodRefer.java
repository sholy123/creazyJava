package com.sholy.chapter6;

@FunctionalInterface
interface Converter{
    Integer convert(String from);
}

@FunctionalInterface
interface MyTest{
    String test(String a, int b, int c);
}
public class MethodRefer {
    public static void main(String[] args) {
        Converter converter = from -> Integer.valueOf("2");
        System.out.println(converter.convert("4"));

        Converter converter1 = Integer::valueOf;
        System.out.println(converter1.convert("345"));

        MyTest myTest = (a,b,c) -> {
            a =  "test" + a;
            return  a;
        };

        System.out.println(myTest.test("12345",1,2));
    }
}
