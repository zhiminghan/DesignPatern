package com.atguigu.singleton.type1;

/**
 * 饿汉式
 *
 */
public class SingletonTest1 {

    public static void main(String[] args) {


        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }


}

class Singleton{

    private static final Singleton s=new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return  s;
    }

}
