package com.wnn.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if (instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazy singletonLazy1= SingletonLazy.getInstance();
        SingletonLazy singletonLazy2= SingletonLazy.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
        for (int i=0;i < 20; i++){
            new Thread(()->{
                System.out.println(System.identityHashCode(SingletonLazy.getInstance()));
            }).start();

        }
    }
}
