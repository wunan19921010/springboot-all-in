package com.wnn.singleton;

public class SingletonHungary {

    private static SingletonHungary singletonHungary= new SingletonHungary();

    private SingletonHungary(){

    }

    public static SingletonHungary getInstance(){
        return singletonHungary;
    }

    public static void main(String[] args) {
        SingletonHungary singletonHungary1 = SingletonHungary.getInstance();
        SingletonHungary singletonHungary2 = SingletonHungary.getInstance();
        System.out.println(singletonHungary1 == singletonHungary2);
    }
}
