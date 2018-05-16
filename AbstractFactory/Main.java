/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Colors.Color;
import ShapeFactory.Shape;

/**
 *
 * @author felip
 */
public class Main {
    public static void main(String[]args){
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color = colorFactory.getColor("Red");
        color.paint();
     
    }
    
}
