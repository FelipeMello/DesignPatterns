/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author felip
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        switch(choice){
            case "Shape":
                //calling a singleton object
                return ShapeFactory.getShapeFactory();
                
            case "Color":
                //calling a singleton object
                return ColorFactory.getColorFactory();
            default :
                return null;
        }
    }
}
