package com.wnn.springboot.mybatis.Bean;

import sun.applet.Main;

public class Singleton {

    private static enum SingletonEnum {
        INSTANCE;

        private Singleton singleton;

        private SingletonEnum() {
            singleton = new Singleton();
        }

        public Singleton getSingleton() {
            return singleton;
        }
    }

    public static Singleton getSingleton() {
        return SingletonEnum.INSTANCE.getSingleton();
    }


    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();
        Singleton singleton = Singleton.getSingleton();
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s2);

    }
}
