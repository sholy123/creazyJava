package com.sholy.chapter6;

public class CarSpeedMeter extends SpeedMeter{
    private double radius;
    public CarSpeedMeter(double radius){
        this.radius = radius;
    }

    @Override
    public double calGirth(){
        return radius * 2 * Math.PI;
    }

    public static void main(String[] args) {
        CarSpeedMeter carSpeedMeter = new CarSpeedMeter(2);
        carSpeedMeter.setTurnRate(15);
        System.out.println(carSpeedMeter.getSpeed());
    }

}
