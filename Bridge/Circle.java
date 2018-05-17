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
public class Circle extends Shape {

    public Circle(Colour clr) {
        super(clr);
    }

    @Override
    public void applyColour() {
        System.out.println("circle filled with color");
        colour.applyColour();
    }
    
}
