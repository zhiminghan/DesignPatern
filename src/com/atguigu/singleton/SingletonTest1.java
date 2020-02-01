package com.atguigu.singleton;

public class SingletonTest1 {


}
class Singleton{

    private static Singleton s;

    private Singleton(){

    }

    public static Singleton getInstance(){

        if(s==null){
            s=new Singleton();
        }
        return  s;
    }

}
