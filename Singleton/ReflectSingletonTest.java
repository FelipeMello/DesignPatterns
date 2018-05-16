/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felipe mello
 * Reflection can be used to destroy all the above singleton implementation 
 * approaches.
 * 
 * When we run this class, you will notice that the hashcode of both the instances
 * are not the same, the pattern has been destroyed. Reflection is very powerful
 * and used in a lot of frameworks like Spring and Hibernate.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectSingletonTest {
    
    public static void main(String[]args){
        EagerInitializedSingleton instanceTwo = null;
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        
        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            
            for(Constructor constructor : constructors){
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)constructor.newInstance();
               break;
            }
        }catch(IllegalAccessException | IllegalArgumentException | InstantiationException | SecurityException | InvocationTargetException e){
        }
        System.out.println("InstanceOne hashcode : "+instanceOne.hashCode());
        System.out.println("InstanceTwo hashcode : "+instanceTwo.hashCode());
    }
}
