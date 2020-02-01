package com.atguigu.principle.singleresponsibility;

public class RoadVehicle implements Vehicle {

    String name;

    public RoadVehicle(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name+" 在公路上跑 ");
    }
}
