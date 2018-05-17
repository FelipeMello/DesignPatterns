/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Felipe Mello           <https://github.com/FelipeMello>
 */
public class BridgeDemo {
    public static void main (String[]args){
        Shape tri = new Triangle(new RedColour());
        tri.applyColour();
        
        Shape circ = new Circle(new BlueColour());
        circ.applyColour();
    }
}
