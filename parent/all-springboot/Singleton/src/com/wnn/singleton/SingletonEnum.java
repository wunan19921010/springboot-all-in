package com.wnn.singleton;

public class SingletonEnum {

    private  SingletonEnum(){}

    public static SingletonEnum getInstance(){
        return SingletonEnumInstance.INSTANCE.getInstance();
    }

    private enum  SingletonEnumInstance{
        INSTANCE;

        private SingletonEnum singletonEnum;

        //此方法只会执行一次，保证实例的唯一性
        private SingletonEnumInstance(){
            singletonEnum = new SingletonEnum();
        }

        private SingletonEnum getInstance(){
            return singletonEnum;
        }

    }

    public static void main(String[] args) {
        for (int i=0;i < 20; i++){
            new Thread(()->{
                System.out.println(System.identityHashCode(SingletonEnum.getInstance()));
            }).start();

        }
    }

}
