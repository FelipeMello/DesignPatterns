/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Felipe Mello           <https://github.com/FelipeMello>
 */
public class BinaryObserver extends Observer{
    
    public BinaryObserver(Subject subject){
        this.suject = subject;
        this.suject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String "+Integer.toBinaryString(this.suject.getState()).toUpperCase());
       
    }
    
}
