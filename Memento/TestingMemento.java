/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author felip
 */
public class TestingMemento {
    
    public static void main(String[]args){
        CareTaker cTaker = new CareTaker();
        Originator orig = new Originator("");
        
        orig.write("Obama in power\n"
                   + " Nuclear code status : nice safe codes "
                   + "\n no lunatics here!\n\n");         
        // save the state
        cTaker.save(orig);
        
        orig.write("Trump in power\n"
                   + " Nuclear code status : Codes not so safe......\n "
                   + "\n LUNATIC...ABORT...ABORT!\n");
        System.out.println(orig);
        
        System.out.println("ABORTING Trump clearance.... reverting\n");
        //undo to last save
        cTaker.undo(orig);
        
        //previous state
        System.out.println(orig);


    }
}
