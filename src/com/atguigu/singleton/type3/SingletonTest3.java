package com.atguigu.singleton.type3;

/**
 * 懒汉式 线程安全 效率低
 *
 */
public class SingletonTest3{

    public static void main(String[] args) {


        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }


}

class Singleton{

    private static Singleton s;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){

        if(s==null){
            s=new Singleton();
        }
        return  s;
    }

}
