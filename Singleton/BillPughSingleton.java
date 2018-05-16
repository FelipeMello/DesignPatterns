/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felipe mello
 * Prior to java 5, java memory model had a lot of issues and above approaches 
 * used to fail in certain scenarios where too many threads try to get the instance
 * of the Singleton class simultaneously. So Bill Pugh came up with different 
 * approach to create the Singleton class using an inner static helper class.
 * 
 * Notice the private inner static class that contains the instance of the 
 * singleton class. When the singleton class is loaded, SingletonHelper class is
 * not loaded into memory and only when someone calls the getInstance method, this
 * class gets loaded and creates the Singleton class instance.
 * 
 * This one of the most widely used approaches for a Singleton class as it doesn't
 * require synchronization.
 */
public class BillPughSingleton {
    
    private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
 
    
}
