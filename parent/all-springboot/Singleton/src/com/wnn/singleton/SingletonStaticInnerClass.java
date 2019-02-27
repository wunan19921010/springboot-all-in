package com.wnn.singleton;

public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass(){}

    private static class StaticInner{
        private static final SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
    }

    public static SingletonStaticInnerClass getInstance(){
        return StaticInner.instance;
    }

    public static void main(String[] args) {
        for (int i=0;i < 20; i++){
            new Thread(()->{
                System.out.println(System.identityHashCode(SingletonStaticInnerClass.getInstance()));
            }).start();

        }
    }
}
