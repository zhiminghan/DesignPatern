package com.atguigu.principle.singleresponsibility;

public class WaterVehicle implements Vehicle {

    String name;

    public WaterVehicle(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name+" run ");
    }
}
