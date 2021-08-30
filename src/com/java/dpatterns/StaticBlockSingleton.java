/*
 * Static block initialization is similar to eager initialization, 
 * except that the instance of the class is created in the static 
 * block that provides the option for exception handling.
 */

package com.java.dpatterns;
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}