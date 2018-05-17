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
public class ObserverPatternDemo {
    public static void main(String[]args){
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("First State change : 15");
        subject.setState(15);
        
        
        System.out.println("Second State change : 20");
        subject.setState(20);
    }
}
