/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felipe mello
 * Thread Safe Singleton. The easiest way to create a thread-safe singleton class
 * is to make the global access method synchronized, so that only one thread can
 * execute this method at a time. General implementation of this approach.
 * 
 * This works fine but readuces the performance because of the cost associated
 * with the synchronized method. To avoid this extra overhead the double checked
 * locking principle is used. In this approach, the synchronized block is used 
 * inside the if statement with an additional check to ensure that only one 
 * instance of that singleton class is created.
 */
public class ThreadSafeSingleton {
    
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
            
        }
        return instance;
    }
    
}
