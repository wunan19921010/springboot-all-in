package com.wnn.singleton;

import javax.xml.transform.Source;

public class SingletonDoubleCheck {

    private static SingletonDoubleCheck instance;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance(){
        if (instance == null){
            synchronized(SingletonDoubleCheck.class){
                if (instance == null){
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDoubleCheck singletonDoubleCheck1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck singletonDoubleCheck2 = SingletonDoubleCheck.getInstance();
        System.out.println(singletonDoubleCheck1 == singletonDoubleCheck2);
    }

}
