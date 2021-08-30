package com.java.dpatterns;
public class ThreadSafeSingleton2 {

    private static ThreadSafeSingleton2 instance;

    private ThreadSafeSingleton2(){}

    public static ThreadSafeSingleton2 getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton2.class) {
            instance = new ThreadSafeSingleton2();
          }
        }
        return instance;
    }
}