/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felip
 * 
 * To overcome this situation with Reflection, Joshua Block suggest the use of
 * Enum to implement the Singleton design pattern as Java ensures that any enum 
 * value is instantiated only once in a Java Program. Since Java Enum values are
 * globally accessible, so is the singleton. The drawback is that the enum type
 * is somewhat inflexible; for example, it does not allow lazy initialization.
 */
public enum EnumSingleton {
    INSTANCE;
    
    public static void soSomething(){
        //do something
    }
}
