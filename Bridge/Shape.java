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
public abstract class Shape {
    //Composition - implementor
    protected Colour colour;
    
    //constructor with implementor as input argument
    public Shape(Colour clr){this.colour = clr;}
    
    abstract public void applyColour();
}
