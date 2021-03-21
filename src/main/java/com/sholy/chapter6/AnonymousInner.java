package com.sholy.chapter6;

abstract class Device{
    private String name;
    public abstract double getPrice();
    public Device(){};
    public Device(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AnonymousInner {

    public void test(Device device){
        System.out.println("name: " + device.getName() + " price: " + device.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        ai.test(new Device("test") {
            @Override
            public double getPrice() {
                return 0;
            }
        });

        Device device = new Device(){
            {
                System.out.println("chushihua kuai !!!");
            }
            public double getPrice(){
                return 23.4;
            }
            @Override
            public String getName(){
                return "jianpan !!!";
            }
        };
        ai.test(device);
    }


}
