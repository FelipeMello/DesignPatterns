/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractShape;

/**
 *
 * @author felip
 */
public class Main {
 public static void main(String[]args) throws CloneNotSupportedException{
     ShapeCache.loadCache();
     
     Shape clonedShape = (Shape) ShapeCache.getShape("1");
     System.out.println("Shape : "+ clonedShape.getType());
     
     Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
     System.out.println("Shape : "+ clonedShape2.getType());
     
     Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
     System.out.println("Shape : "+ clonedShape.getType());
 }   
}
