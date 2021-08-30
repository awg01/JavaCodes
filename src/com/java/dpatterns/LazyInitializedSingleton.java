/*Lazy initialization is a method to implement the Singleton 
 * pattern to create an instance in the global access method.
 */

package com.java.dpatterns;
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}