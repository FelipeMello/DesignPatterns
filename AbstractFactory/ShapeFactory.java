/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Colors.Color;
import AbstractFactory.*;
import Shapes.Circle;
import Shapes.Rectangle;
import ShapeFactory.Shape;
import Shapes.Square;


/**
 *
 * @author felip
 */
public class ShapeFactory extends AbstractFactory{
    //Singleton
    private ShapeFactory(){};
    private static ShapeFactory instace = new ShapeFactory();
    public static ShapeFactory getShapeFactory(){
        return instace;
    }
    
    @Override
    public Shape getShape(String shapeType){
        switch(shapeType){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
                
            default :
                return null;
                
        }
    }
    @Override
    public Color getColor(String color) {
        return null;
    }
    
    
    
}
