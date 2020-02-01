package com.atguigu.singleton.type2;

/**
 * 懒汉式 线程不安全
 *
 */
public class SingletonTest2 {

    public static void main(String[] args) {


        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }


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
