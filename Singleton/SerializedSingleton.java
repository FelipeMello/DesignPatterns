/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author felipe mello
 * Sometimes we need to implement the Serializable interface in a Singleton class
 * to save the state in a file system and retrieve it later. Here is a small 
 * singleton class that implements Serializable interface.
 * 
 * The problem with the serialized singleton class is that whenever we 
 * de-serialize it,  it will create a new instance of the class.
 */

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
    
    private static final long serialVersionUID = -760476693017737115L;
    
    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
        
    }
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
