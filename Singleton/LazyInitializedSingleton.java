/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felipe mello
 * Lazy initialization implementation creates the instance in the global access
 * method
 * This implementation works fine in the case of a single threaded environment.
 * When it comes to multithreaded systems, it can cause issues if multiple 
 * threads are inside the if statement at the same time. It will destroy the 
 * singleton pattern and both threads will get difference instances of the 
 * singleton class.
 */
public class LazyInitializedSingleton {
    /**Private static variable of the same class that is the only instance of the class*/
    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    /**Public static method that returns the instance of the class,
     this is the global access point for the outer world to get the instance of the singleton class*/
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    
}
