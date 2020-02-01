package com.atguigu.singleton.type4;

/**
 * 懒汉式 线程安全 双重检索机制
 *
 */
public class SingletonTest4{

    public static void main(String[] args) {


        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }


}

class Singleton{

    private static volatile Singleton s;

    private Singleton(){

    }

    public static Singleton getInstance(){

        if(s==null){
            synchronized (Singleton.class){
                if(s==null) {
                    s = new Singleton();
                }
            }
        }
        return  s;
    }

}
