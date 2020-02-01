package com.atguigu.principle.singleresponsibility;

public class AirVehicle implements Vehicle {

    String name;

    public AirVehicle(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name+" run ");
    }
}
