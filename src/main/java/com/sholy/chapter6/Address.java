package com.sholy.chapter6;

public class Address {

    private final String detail;
    private final String postCode;

    public Address(String detail, String postCode){
        this.detail =detail;
        this.postCode = postCode;
//        detail = "";
//        postCode = "";
    }

    public Address(){
        detail = "";
        postCode = "";
    }

    public String getDetail(){
        return this.detail;
    }

    public String getPostCode(){
        return this.postCode;
    }



}
