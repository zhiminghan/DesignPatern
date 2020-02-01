package com.atguigu.singleton.type6;

/**
 * 枚举
 *
 */
public class SingletonTest6{

    public static void main(String[] args) {


        System.out.println(Singleton.INSTANCE.hashCode());
        System.out.println(Singleton.INSTANCE.hashCode());

    }


}

enum  Singleton{

    INSTANCE

}
