package org.nhnacademy.edu.springframework.messagesender;

public class Singleton {
//    private static Singleton instance;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if(instance == null){
//            synchronized (Singleton.class){
//
//                instance=new Singleton();
//            }
//
//        }
//        return instance;
//    }

    public static Singleton getInstance(){
        return LazyHolder.singleton;
    }
    private Singleton(){}
    private static class LazyHolder{
        private static final Singleton singleton=new Singleton();
    }
}
