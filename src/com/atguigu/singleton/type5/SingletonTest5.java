package com.atguigu.singleton.type5;

/**
 * 懒汉式 线程安全 静态内部类
 *
 */
public class SingletonTest5{

    public static void main(String[] args) {


        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }


}

class Singleton{


    private Singleton(){

    }

    static class Instance{

        private static Singleton s=new Singleton();



    }

    public static Singleton getInstance(){

        return  Instance.s;
    }

}
