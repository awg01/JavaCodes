/*
 * In eager initialization, the instance of Singleton Class is 
 * created at the time of class loading. This is the easiest 
 * method to create a Singleton class, 
 * but it has the drawback of the instance 
 * being created even though client application might not be using it.
 */
package com.java.dpatterns;
public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}