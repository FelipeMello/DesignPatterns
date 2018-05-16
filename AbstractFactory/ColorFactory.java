/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Colors.Blue;
import Colors.Color;
import Colors.Red;
import Colors.White;
import ShapeFactory.Shape;


/**
 *
 * @author felip
 */
public class ColorFactory extends AbstractFactory {
    //Singleton
    private ColorFactory(){};
    private static ColorFactory instance = new ColorFactory();
    
    public static ColorFactory getColorFactory(){
        return instance;
    }
    
    @Override
    public Color getColor(String shapeType){
        switch(shapeType){
            case "White":
                return new White();
            case "Blue":
                return new Blue();
            case "Red":
                return new Red();
                
            default :
                return null;
                
        }
    }

    @Override
    Shape getShape(String shape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
