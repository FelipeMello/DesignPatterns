/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felipe mello
 */

/**In eager initialization, the instance of the Singleton Class is created
 at the time of class loading, this is the easiest method to create a singleton
 class but it has a drawback, that instance is created even though the client 
 application night not be using it.
 If your singleton class is not using a lot of resources, this is the approach 
 to use. But most of the scenarios, Singleton classes are created for resource 
 such as File System, Database connections etc. and we should avoid the 
 * instantiation until the clients calls the 
 @getInstance method. Also this method doesn't provide any options for exception handling*/
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instace = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications using constructor
    /**Private constructor to restrict instantiation of the class from other classes.*/
    private EagerInitializedSingleton(){}
    
    public static EagerInitializedSingleton getInstance(){
        return instace;
    }
   
}
