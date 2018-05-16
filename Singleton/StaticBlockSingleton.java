/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felipe mello
 * Static block initialization implementation is similar to eager initialization,
 * except that the instance of the class is created in the static block that 
 * provides an option for exception handling.
 * 
 * Both eager initialization and static block initialization create the instance
 * even before it's being used and that is not the best practice.
 */
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
